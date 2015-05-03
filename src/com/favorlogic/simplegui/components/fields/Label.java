package com.favorlogic.simplegui.components.fields;

import java.util.List;

public class Label extends TextBox {

    @Override
    public boolean validate(List<String> errorMessages) {
        return true;
    }
}
