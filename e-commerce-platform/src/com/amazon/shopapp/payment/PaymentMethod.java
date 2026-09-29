package com.amazon.shopapp.payment;

public class PaymentMethod {

    public void validateBalance(double totalAmount) {
        System.out.println("Step 1: Checking Amazon checkout cart secure session for amount: ₹" + totalAmount);
    }

    public void executeTransaction(double totalAmount) {
        System.out.println("Step 2: Processing payment via standard fallback gateway...");
    }
}
