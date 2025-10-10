package com.demo.common.cache;

public interface Cache {

    boolean put(String key, Object value);

    Object get(String key);

    boolean remove(String key);
}
