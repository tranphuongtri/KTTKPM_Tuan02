package com.ecommerce.abstractfactory.windows;

import com.ecommerce.abstractfactory.products.Checkbox;

public class WindowsCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("Rendering Windows Checkbox");
    }
}