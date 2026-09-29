package com.xworkz.shopapp.payment.card;

import com.xworkz.shopapp.payment.PaymentMethod;

public class CreditCardPayment extends PaymentMethod {

    @Override
    public void validateSession() {
        System.out.println("SubClass: Authorizing secure card payment portal connection.");
    }

    @Override
    public void verifyBalance() {
        System.out.println("SubClass: Checking card available credit limits with issuing bank.");
    }

    @Override
    public void applyCoupon() {
        System.out.println("SubClass: Applying instant 10% credit card partner bank cashback.");
    }

    @Override
    public void calculateTax() {
        System.out.println("SubClass: Calculating card handling surcharge and processing fees.");
    }

    @Override
    public void reserveFunds() {
        System.out.println("SubClass: Pre-authorizing entire purchase price via payment link.");
    }

    @Override
    public void processPayment() {
        System.out.println("SubClass: Charging card through secured Visa/Mastercard processing grid.");
    }

    @Override
    public void generateInvoice() {
        System.out.println("SubClass: Constructing digital receipt showing truncated card number details.");
    }

    @Override
    public void sendNotification() {
        System.out.println("SubClass: Triggering transaction confirmation alert via SMS and Email.");
    }

    @Override
    public void updateLedger() {
        System.out.println("SubClass: Logging transaction details directly to financial audit vault.");
    }
}
