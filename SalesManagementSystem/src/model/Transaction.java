package model;

import java.time.LocalDate;

public class Transaction {
    TransactionItem[] lineItems;
    LocalDate currenDate = LocalDate.now();
    private String date;
    private int customerId;

    public Transaction() {
    }

    public Transaction(TransactionItem[] lineItems, String date, int customerId) {
        this.lineItems = lineItems;
        this.date = date;
        this.customerId = customerId;
    }

    // Line Items
    public TransactionItem[] getLineItems() {
        return lineItems;
    }
    public void setLineItems(TransactionItem[] lineItems) {
        this.lineItems = lineItems;
    }

    // Date
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }

    // Customer ID
    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
}
