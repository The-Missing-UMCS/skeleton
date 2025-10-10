package com.demo.utils;

import org.jetbrains.annotations.Contract;

/**
 * A utility class that provides common assertion methods for validating
 * arguments and application state.
 * <p>
 * Each method throws an appropriate {@link IllegalArgumentException} or
 * {@link IllegalStateException} when a validation fails.
 * <p>
 * This class is intended for defensive programming to ensure method contracts
 * are not violated.
 */
public class Asserts {

    /**
     * Asserts that the given object is not {@code null}.
     *
     * @param object  the object to validate
     * @param message the exception message to use if the assertion fails
     * @throws IllegalArgumentException if {@code object} is {@code null}
     */
    @Contract("null, _ -> fail")
    public static void notNull(Object object, String message) {
        if (object == null) {
            throw new IllegalArgumentException(message);
        }
    }

    /**
     * Asserts that the given string is neither {@code null} nor empty.
     *
     * @param string  the string to validate
     * @param message the exception message to use if the assertion fails
     * @throws IllegalArgumentException if {@code string} is {@code null} or empty
     */
    @Contract("null, _ -> fail")
    public static void notEmpty(String string, String message) {
        if (string == null || string.isEmpty()) {
            throw new IllegalArgumentException(message);
        }
    }

    /**
     * Asserts that the given state is {@code true}.
     *
     * @param state   the boolean expression representing the state to check
     * @param message the exception message to use if the assertion fails
     * @throws IllegalStateException if {@code state} is {@code false}
     */
    @Contract("false, _ -> fail")
    public static void state(boolean state, String message) {
        if (!state) {
            throw new IllegalStateException(message);
        }
    }
}
