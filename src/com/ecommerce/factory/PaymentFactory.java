package com.ecommerce.factory;

public class PaymentFactory {

    public static Payment createPayment(String type) {

        if (type.equalsIgnoreCase("creditcard")) {
            return new CreditCardPayment();
        }

        if (type.equalsIgnoreCase("paypal")) {
            return new PaypalPayment();
        }

        if (type.equalsIgnoreCase("bank")) {
            return new BankTransferPayment();
        }

        throw new IllegalArgumentException("Invalid payment type");
    }
}