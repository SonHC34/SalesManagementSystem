package model;

import java.util.Scanner;

public class ProductManagement {
    //private để đóng dữ liệu
    private Product[] arr = new Product[100];
    private int count = 0;

    // Getter để lớp Inventory có thể tiếp cận danh sách sản phẩm
    public Product[] getArr() {
        return arr;
    }
    public int getCount() {
        return count;
    }

    //addProducts
    public void addMoreProducts (){ 
        boolean cont= false;
        //ham theo nhieu products
        do {
            arr[count]=new Product();
            arr[count].addNewProduct();
            count++;
            System.out.println("Add more(true|false)?:");
            Scanner sc=new Scanner(System.in);
            cont = sc.nextBoolean();
        }while( cont==true && count < 100);
    }

    //viewAllProducts
    public void viewAllProducts() {
        if (count == 0) {
            System.out.println("Danh sách sản phẩm trống!");
        } else {
            System.out.println("----- Danh sách sản phẩm -----");
            for (int i = 0; i < count; i++) {
                arr[i].viewAllProduct();
            }
        }
    }
    //remove
    public void removeProductById(int id) {
    for (int i = 0; i < count; i++) {
        if (arr[i].getIdProduct() == id) {
            for (int j = i; j < count - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[count - 1] = null;
            count--;
            System.out.println("Xóa thành công sản phẩm ID: " + id);
            return;
        }
    }
    System.out.println("Không tìm thấy sản phẩm cần xóa.");
    }
    //Search products by name or category.
    public void searchProduct(String keyword) {
    boolean found = false;
    for (int i = 0; i < count; i++) 
    {
        if (arr[i].getNameProduct().equalsIgnoreCase(keyword) || arr[i].getCategoryProduct().equalsIgnoreCase(keyword)) {
            arr[i].viewAllProduct();
            found = true;
        }
    }
    if (!found) {
        System.out.println("No product found with keyword: " + keyword);
    }
    
    
}
}
