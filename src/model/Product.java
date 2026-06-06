package model;

import java.util.Scanner;

/*
Các quy tắc đặt tên:
Fields: 
- idProduct: int
- nameProduct: String
- categoryProduct: String
- price: double
- stockQuantity: int
Method:  
+ updateStockQuantity(): void 
*/

public class Product {
    private int idProduct;
    private String nameProduct;
    private String categoryProduct; 
    private double price;
    private int stockQuantity;

    // Constructor
    //constructor mặc định
    public Product (){

    }
    public Product(int idProduct, String nameProduct, String categoryProduct, double price, int stockQuantity) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.categoryProduct = categoryProduct;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    // ID
    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }
    
    // Name
    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    // Category product
    public String getCategoryProduct() {
        return categoryProduct;
    }

    public void setCategoryProduct(String categoryProduct) {
        this.categoryProduct = categoryProduct;
    }

    // Price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    //stock 
    public int getStockQuantity() {
        return this.stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }
    // Phương thức cập nhật số lượng kho (Yêu cầu cơ bản / BR7)
    public void updateStockQuantity(int quantity) {
        this.stockQuantity += quantity; 
    }
    
    //nhap ma ten va gia cho san pham
    public void addNewProduct(){
        Scanner sc = new Scanner (System.in);
        System.out.println("ID: ");
             idProduct= sc.nextInt();
             sc.nextLine(); // bỏ dognf thừa

             System.out.println("Name: ");
             nameProduct=sc.nextLine();

             System.out.println("Category; ");
             categoryProduct=sc.nextLine();

             System.out.println("Price: ");
             price=sc.nextDouble();

             System.out.print("Stock Quantity: ");
             stockQuantity = sc.nextInt();
            
    }
    //update product
    public void updateProduct (int idProduct, String  nameProduct , String categoryProduct, double price){
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.categoryProduct = categoryProduct;
        this.price = price;
    }
    //view all product
    public void viewAllProduct (){
        System.out.println("ID: " + idProduct);
        System.out.println("Name: " + nameProduct);
        System.out.println("Category: " + categoryProduct);
        System.out.println("Price: " + price);
        System.out.println("Stock: " + stockQuantity);
    }
    
}
    