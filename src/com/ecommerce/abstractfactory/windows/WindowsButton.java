package com.ecommerce.abstractfactory.windows;

import com.ecommerce.abstractfactory.products.Button;

public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("Rendering Windows Button");
    }
}