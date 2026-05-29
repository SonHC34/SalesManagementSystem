package service;

import model.Product;

public class InventoryManagement {
    private Product[] inventory;
    private ProductManagement pm;    // pm - product management

    public InventoryManagement(ProductManagement pm) {
        this.pm = pm;
        this.inventory = pm.getProducts();  // lấy dữ liệu từ lớp ProductManagement
    }
    
    public void UpdateProductAfterSale() {

    }

    public void CheckAvailableStock() {

    }
}
