package com.demo.sample.service;

import com.demo.sample.domain.Sample;
import com.demo.sample.repository.SampleRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SampleServiceImpl implements SampleService {
    private final SampleRepository sampleRepository;

    public Sample createSample(Sample sample) {
        return sampleRepository.save(sample);
    }

    public void performComplexOperation(Sample sample) {
        // TODO: Logic
    }
}
