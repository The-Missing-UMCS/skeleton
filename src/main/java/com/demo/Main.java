package com.demo;


import com.demo.boot.ApplicationContext;
import com.demo.interaction.AppRunner;

public class Main {

    public static void main(String[] args) {
        // Your only entry for your assignment
        // Others should be able to run your assignment easily by running the main in Main
        ApplicationContext.get(AppRunner.class).run();
    }
}