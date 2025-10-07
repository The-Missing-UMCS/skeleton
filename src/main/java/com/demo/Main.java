package com.demo;


import com.demo.boot.ApplicationContext;
import com.demo.sample.domain.Sample;
import com.demo.sample.service.SampleService;

public class Main {

    public static void main(String[] args) {
        // Your only entry for your assignment
        // Others should be able to run your assignment easily by running the main in Main
        SampleService sampleService = ApplicationContext.get(SampleService.class);
        sampleService.createSample(new Sample());
    }
}