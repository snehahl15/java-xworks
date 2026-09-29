package com.xworkz.shopapp.payment;

public class PaymentMethod {
    public void validateSession() {
        System.out.println("Parent: Validating active checkout secure token session.");
    }

    public void verifyBalance() {
        System.out.println("Parent: Fetching ledger data account balance metrics.");
    }

    public void applyCoupon() {
        System.out.println("Parent: Checking structural coupon discounts availability.");
    }

    public void calculateTax() {
        System.out.println("Parent: Computing regional sales GST calculations.");
    }

    public void reserveFunds() {
        System.out.println("Parent: Placing short-term hold on requested transaction funds.");
    }

    public void processPayment() {
        System.out.println("Parent: Running default fallback bank network wire.");
    }

    public void generateInvoice() {
        System.out.println("Parent: Creating basic plain text order breakdown slip.");
    }

    public void sendNotification() {
        System.out.println("Parent: Dispatching basic system alert log entry.");
    }

    public void updateLedger() {
        System.out.println("Parent: Writing generic transaction trace to main node logs.");
    }
}

