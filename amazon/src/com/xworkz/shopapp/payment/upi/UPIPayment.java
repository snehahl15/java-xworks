package com.xworkz.shopapp.payment.upi;

import com.xworkz.shopapp.payment.PaymentMethod;

public class UPIPayment extends PaymentMethod {

    @Override
    public void validateSession() {
        System.out.println("SubClass: Connecting safely to National Payments Corporation interface.");
    }

    @Override
    public void verifyBalance() {
        System.out.println("SubClass: Querying linked bank account via verified server handshake.");
    }

    @Override
    public void applyCoupon() {
        System.out.println("SubClass: Redeeming random scratch card reward voucher.");
    }

    @Override
    public void calculateTax() {
        System.out.println("SubClass: Zero charge payment protocol applied to transaction.");
    }

    @Override
    public void reserveFunds() {
        System.out.println("SubClass: Isolating transaction request pending personal MPIN entry.");
    }

    @Override
    public void processPayment() {
        System.out.println("SubClass: Performing immediate instant peer-to-peer bank account switch.");
    }

    @Override
    public void generateInvoice() {
        System.out.println("SubClass: Compiling receipt with bank tracking code reference format.");
    }

    @Override
    public void sendNotification() {
        System.out.println("SubClass: Delivering real-time payment success alert via push notification.");
    }

    @Override
    public void updateLedger() {
        System.out.println("SubClass: Saving distinct central bank database tracing hash key.");
    }

}
