package service;

import model.Transaction;

public class SalesManagement {
    Transaction[] salesTransaction = new Transaction[100];
    int count = 0;

    // =====================================================================================================

    public void CreateNewTransaction() {
        System.out.println("----------- NEW TRANSACTION -----------");
        System.out.format("Transaction ID: ", count);
        System.out.format("Customer ID: C%02d", count);
        System.out.format("Date: ");
        
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

    // =====================================================================================================
    // Phần getter & setter



}
