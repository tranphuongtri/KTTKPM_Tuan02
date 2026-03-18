package com.ecommerce.abstractfactory.mac;

import com.ecommerce.abstractfactory.products.Checkbox;

public class MacCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("Rendering Mac Checkbox");
    }
}