package com.demo.sample.service;

import com.demo.sample.domain.Sample;

public interface SampleService {

    Sample createSample(Sample sample);

    void performComplexOperation(Sample sample);
}
