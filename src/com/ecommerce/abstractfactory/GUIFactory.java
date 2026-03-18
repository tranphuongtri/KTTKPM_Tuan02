package com.ecommerce.abstractfactory;

import com.ecommerce.abstractfactory.products.Button;
import com.ecommerce.abstractfactory.products.Checkbox;

public interface GUIFactory {

    Button createButton();
    Checkbox createCheckbox();

}