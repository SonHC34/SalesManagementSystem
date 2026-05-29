package service;

import model.Product;
import java.util.Scanner;

public class ProductManagement {
    Product[] products = new Product[100];
    Scanner sc = new Scanner(System.in);
    private int countProduct = 0;

    // trả về danh sách mảng cho lớp inventory management dùng
    public Product[] getProducts() {
        return this.products;
    }
    

    public void AddNewProduct() {
        sc.close();
    }

    public void UpdateProduct() {

    }

    public void RemoveProduct() {

    }

    public void ViewAllProduct() {

    }
}
