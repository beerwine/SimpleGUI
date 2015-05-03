package com.favorlogic.simplegui.components.fields;

import com.favorlogic.simplegui.components.Component;

import java.util.List;

public class TextBox extends Component {
    private String name;
    private String value;

    @Override
    public boolean validate(List<String> errorMessages) {
        // FIXME: implement validation logic
        return false;
    }

    /**
     * @return value of the text field
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets value of the text field
     */
    public void setValue(String value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
