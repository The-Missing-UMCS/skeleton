package com.demo.sample.repository;

import com.demo.common.Repository;
import com.demo.sample.domain.Sample;

import java.util.List;
import java.util.Optional;

public class SampleRepository implements Repository<Sample> {

    @Override
    public Sample save(Sample sample) {
        return sample;
    }

    @Override
    public Optional<Sample> findById(String id) {
        return Optional.empty();
    }

    @Override
    public List<Sample> findAll() {
        return List.of();
    }

    @Override
    public boolean deleteById(String id) {
        return false;
    }
}
