package service;

import model.customer.Customer;

public class SalesTransaction {
    Customer cusTransaction = new Customer();
    private int idTransaction;
    private String date; 

    // =====================================================================================================

    public void CreateNewTransaction() {
        System.out.println("----------- NEW TRANSACTION -----------");
        
        
    }

    // =====================================================================================================

    public void CalculateTotalBillAmount() {
        System.out.println("----------- CALCULATE TOTAL BILL -----------");
    }

    // =====================================================================================================

    public void UpdateCancelTransaction() {
        System.out.println("----------- UPDATE TRANSACTION -----------");

    }

    // =====================================================================================================

    public void ViewTransactionHistory() {
        System.out.println("----------- VIEW TRANSACTION HISTORY -----------");
    }
}
