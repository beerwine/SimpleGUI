package com.favorlogic.simplegui.components.validators;

import java.util.List;

public interface Validator {
    /**
     * Validates the input and adds error message to {@code errorMessages}
     * @param input text to validate
     * @param errorMessages contains validation error messages
     * @return {@code true} if the {@code input} text is valid
     */
    boolean validate(String input, List<String> errorMessages);
}
