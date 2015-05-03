package com.favorlogic.simplegui.components;

import com.favorlogic.simplegui.components.validators.Validator;

import java.util.LinkedList;
import java.util.List;

public abstract class Component {
    private final List<Validator> validators = new LinkedList<>();

    /**
     * Validates the component and adds error message to {@code errorMessages}
     * @param errorMessages contains validation error messages
     * @return {@code true} if the component is valid
     */
    public abstract boolean validate(List<String> errorMessages);

    /**
     * Adds validator
     * @param validator
     */
    public void addValidator(Validator validator) {
        validators.add(validator);
    }

    /**
     * @return validators of this component
     */
    public List<Validator> getValidators() {
        return validators;
    }
}
