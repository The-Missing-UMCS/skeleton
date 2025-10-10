package com.demo.application.criteria;

public interface Criteria<T> {

    boolean test(T object);
}
