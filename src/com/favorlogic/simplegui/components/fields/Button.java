package com.favorlogic.simplegui.components.fields;

import com.favorlogic.simplegui.components.Component;
import com.favorlogic.simplegui.components.listeners.ClickListener;

import java.util.List;

public class Button extends Component {
    private String name;

    @Override
    public boolean validate(List<String> errorMessages) {
        return true;
    }

    public void addClickListener(ClickListener listener) {
        // FIXME: implement listener registration
    }

    public void click() {
        // FIXME: fire click event
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
