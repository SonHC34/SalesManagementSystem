packet model;

public class ListProducts{
    Product[] arr = new Product[100];
    int count = 0;

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
            return;
        }
    }
}

    
}