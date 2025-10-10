package com.demo.common.cache;

/**
 * Represents a simple key-value cache that allows storing, retrieving,
 * and removing cached objects by key.
 */
public interface Cache {

    /**
     * Stores a value in the cache associated with the specified key.
     *
     * @param key   the unique key to identify the cached value; must not be {@code null}
     * @param value the value to cache; may be {@code null} depending on implementation
     * @return {@code true} if the value was successfully stored; {@code false} otherwise
     */
    boolean put(String key, Object value);

    /**
     * Retrieves a cached value associated with the specified key.
     *
     * @param key the key whose associated value is to be returned; must not be {@code null}
     * @return the cached value, or {@code null} if no value is found for the given key
     */
    Object get(String key);

    /**
     * Removes the cached value associated with the specified key.
     *
     * @param key the key whose mapping is to be removed from the cache; must not be {@code null}
     * @return {@code true} if a value was removed; {@code false} if no value existed for the key
     */
    boolean remove(String key);
}
