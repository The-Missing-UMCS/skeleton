package com.demo;


import com.demo.application.dto.codesnippet.CreateCodeSnippetModel;
import com.demo.application.service.CodeSnippetService;
import com.demo.boot.ApplicationContext;

public class Main {

    public static void main(String[] args) {
        // Your only entry for your assignment
        // Others should be able to run your assignment easily by running the main in Main
        CodeSnippetService sampleService = ApplicationContext.get(CodeSnippetService.class);
        sampleService.addCodeSnippet(new CreateCodeSnippetModel());
    }
}