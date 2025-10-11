package com.demo.boot.context;

import lombok.Data;

@Data
public class UserContext {

    private static String username;

    public static void setUsername(String username) {
        UserContext.username = username;
    }
}
