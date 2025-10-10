package com.demo.utils;

import org.jetbrains.annotations.Contract;

public class Asserts {

    @Contract("null, _ -> fail")
    public static void notNull(Object object, String message) {
        if (object == null) {
            throw new IllegalArgumentException(message);
        }
    }

    @Contract("null, _ -> fail")
    public static void notEmpty(String string, String message) {
        if (string == null || string.isEmpty()) {
            throw new IllegalArgumentException(message);
        }
    }

    @Contract("false, _ -> fail")
    public static void state(boolean state, String message) {
        if (!state) {
            throw new IllegalStateException(message);
        }
    }
}
