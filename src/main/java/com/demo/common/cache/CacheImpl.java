package com.demo.common.cache;

import java.util.HashMap;
import java.util.Map;

public class CacheImpl implements Cache {

    private final Map<String, Object> cache = new HashMap<>();

    @Override
    public boolean put(String key, Object value) {
        if(cache.containsKey(key)) {
            return false;
        }
        cache.put(key, value);
        return true;
    }

    @Override
    public Object get(String key) {
        return cache.get(key);
    }

    @Override
    public boolean remove(String key) {
        return cache.remove(key) != null;
    }
}
