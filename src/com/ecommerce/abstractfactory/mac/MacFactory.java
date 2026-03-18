package com.ecommerce.abstractfactory.mac;

import com.ecommerce.abstractfactory.GUIFactory;
import com.ecommerce.abstractfactory.products.Button;
import com.ecommerce.abstractfactory.products.Checkbox;

public class MacFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}