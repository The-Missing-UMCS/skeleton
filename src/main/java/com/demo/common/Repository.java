package com.demo.common;

import java.util.List;
import java.util.Optional;

public interface Repository<T> {

    T save(T t);

    Optional<T> findById(String id);

    List<T> findAll();

    boolean deleteById(String id);
}
