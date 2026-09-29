package com.xworkz.shopapp;

import com.xworkz.shopapp.payment.PaymentMethod;
import com.xworkz.shopapp.payment.card.CreditCardPayment;
import com.xworkz.shopapp.payment.upi.UPIPayment;

public class AmazonRunner {
    public static void main(String[] args) {
        PaymentMethod paymentMethod1 = new CreditCardPayment();
        paymentMethod1.validateSession();
        paymentMethod1.verifyBalance();
        paymentMethod1.applyCoupon();
        paymentMethod1.calculateTax();
        paymentMethod1.reserveFunds();
        paymentMethod1.processPayment();
        paymentMethod1.generateInvoice();
        paymentMethod1.sendNotification();
        paymentMethod1.updateLedger();

        System.out.println("----------------------------------------");

        PaymentMethod paymentMethod2 = new UPIPayment();
        paymentMethod2.validateSession();
        paymentMethod2.verifyBalance();
        paymentMethod2.applyCoupon();
        paymentMethod2.calculateTax();
        paymentMethod2.reserveFunds();
        paymentMethod2.processPayment();
        paymentMethod2.generateInvoice();
        paymentMethod2.sendNotification();
        paymentMethod2.updateLedger();

        System.out.println("----------------------------------------");
    }
}
