package com.ecommerce.abstractfactory.mac;

import com.ecommerce.abstractfactory.products.Button;

public class MacButton implements Button {

    @Override
    public void paint() {
        System.out.println("Rendering Mac Button");
    }
}