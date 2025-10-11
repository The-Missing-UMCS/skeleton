package com.demo.utils;

import java.util.Scanner;

public class InputUtils {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static int getIntegerInput(String message) {
        System.out.print(message);
        return Integer.parseInt(SCANNER.nextLine());
    }

    public static String getStringInput(String message) {
        System.out.print(message);
        return SCANNER.nextLine();
    }
}
