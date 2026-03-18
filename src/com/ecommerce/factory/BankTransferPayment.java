package com.ecommerce.factory;

public class BankTransferPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Bank Transfer");
    }
}