package model;

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
    if (!found) 
    {
        System.out.println("No product found with keyword: " + keyword);
    }
    }
}
    





