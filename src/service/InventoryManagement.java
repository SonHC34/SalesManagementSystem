package service;
/**
 * fields
 * Product[] products
 * 
 * methods
 * addNewProducts
 * updateProduct
 * view all product
 * removeProduct
 * searchProduct
 */
public class InventoryManagement {
    Product[]arr=new Product[100];
    int count = 0;
    Scanner sc = new Scanner(System.in);
    

    
    //updateProduct
    public void updateProduct (int id, int quantity){
        for (int i = 0; i < count; i++)
        {
            if (arr[i].getIdProduct() == id)
            {
                arr[i].updateStockQuantity(quantity);
            
            }
        }
    }
    //viewall
    public void viewAllProducts(){
        for (int i = 0; i < count, i++){
            System.out.println(arr[i].getIdProduct() +"-"+ arr[i].getNameProduct() +"-"+ arr[i].getCategoryProduct() +"-"+ arr[i].getPrice() +"-"+ arr[i].getStockQuantity());
        }
    }

    
    
   

}
