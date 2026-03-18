package com.ecommerce.main;

import com.ecommerce.singleton.DatabaseConnection;
import com.ecommerce.factory.Payment;
import com.ecommerce.factory.PaymentFactory;
import com.ecommerce.abstractfactory.GUIFactory;
import com.ecommerce.abstractfactory.products.Button;
import com.ecommerce.abstractfactory.products.Checkbox;
import com.ecommerce.abstractfactory.windows.WindowsFactory;

public class Main {

    public static void main(String[] args) {

        // Singleton
        DatabaseConnection db = DatabaseConnection.getInstance();
        db.query("SELECT * FROM products");

        // Factory Method
        Payment payment = PaymentFactory.createPayment("paypal");
        payment.pay(150);

        // Abstract Factory
        GUIFactory factory = new WindowsFactory();

        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        button.paint();
        checkbox.paint();
    }
}