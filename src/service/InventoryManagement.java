package service;

import model.Product;

public class InventoryManagement {
    private Product[] inventory;
    private ProductManagement pm;    // pm - product management

    // Constructor lấy dữ liệu từ lớp ProductManagement gán vào mảng inventory
    public InventoryManagement(ProductManagement pm) {
        this.pm = pm;
        this.inventory = pm.getArr();  // lấy dữ liệu từ lớp ProductManagement
    }

    /**
     * Tìm sản phẩm trong mảng inventory bằng ID (Hàm bổ trợ)
     */
    private Product findProductById(int idProduct) {
        for (int i = 0; i < pm.getCount(); i++) {
            if (inventory[i] != null && inventory[i].getIdProduct() == idProduct) {
                return inventory[i];
            }
        }
        return null;
    }
    
    /**
     * Tính năng 1: Cập nhật tồn kho sau khi bán (Yêu cầu 1 / BR7)
     * Giải thích: Nhận vào ID và số lượng bán, tiến hành trừ kho nếu hợp lệ.
     */
    public void UpdateProductAfterSale(int idProduct, int quantitySold) {
        Product p = findProductById(idProduct);
        
        // Nếu sản phẩm tồn tại, tiến hành trừ kho trực tiếp bằng số âm
        if (p != null) {
            p.updateStockQuantity(-quantitySold); // Gọi hàm toán tử -= đã viết bên lớp Product
            System.out.println("--- CẬP NHẬT KHO THÀNH CÔNG ---");
            System.out.println("Sản phẩm: " + p.getNameProduct() + " | Kho hiện tại: " + p.getStockQuantity());
        }
    }
    /**
     * Tính năng 2: Kiểm tra số lượng kho trước khi xác nhận bán (Yêu cầu 2 / BR4 / BR5)
     * Giải thích: Trả về true nếu đủ hàng để bán, trả về false nếu không hợp lệ hoặc thiếu hàng.
     */
    public boolean CheckAvailableStock(int idProduct, int quantitySold) {
        // BR5: Số lượng bán bắt buộc phải lớn hơn 0
        if (quantitySold <= 0) {
            System.out.println("Lỗi: Số lượng bán phải lớn hơn 0!");
            return false;
        }

        Product p = findProductById(idProduct);
        
        // BR3: Kiểm tra xem sản phẩm có tồn tại trong kho không
        if (p == null) {
            System.out.println("Lỗi: Không tìm thấy sản phẩm có ID này!");
            return false;
        }

        // BR4: Kiểm tra số lượng tồn kho xem có đủ cung ứng không
        if (p.getStockQuantity() < quantitySold) {
            System.out.println("Lỗi: Kho không đủ hàng! Hiện chỉ còn: " + p.getStockQuantity());
            return false;
        }

        // Đạt mọi điều kiện hợp lệ
        System.out.println("Hợp lệ: Đủ hàng trong kho để thực hiện giao dịch.");
        return true; 
    }
}
