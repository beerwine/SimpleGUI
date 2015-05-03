package com.favorlogic.simplegui.components.layouts;

import com.favorlogic.simplegui.components.Component;

import java.util.LinkedList;
import java.util.List;

/**
 * Composite component
 */
public abstract class Layout extends Component {
    protected final List<Component> components = new LinkedList<>();

    /**
     * Adds the component to the layout
     */
    void addComponent(Component component) {
        components.add(component);
    }

    /**
     * @return all components in layout
     */
    List<Component> getComponents() {
        return components;
    }
}
