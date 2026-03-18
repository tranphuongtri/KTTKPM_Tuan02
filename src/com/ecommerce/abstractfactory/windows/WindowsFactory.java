package com.ecommerce.abstractfactory.windows;

import com.ecommerce.abstractfactory.GUIFactory;
import com.ecommerce.abstractfactory.products.Button;
import com.ecommerce.abstractfactory.products.Checkbox;

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}