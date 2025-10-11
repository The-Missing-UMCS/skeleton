package com.demo.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * A utility class for loading and reading values from {@code .properties} files.
 * <p>
 * Supports loading property files from both the classpath and external file system paths.
 */
public final class PropertyUtils {

    private PropertyUtils() {
        throw new UnsupportedOperationException("Utility class should not be instantiated");
    }

    /**
     * Loads a {@link Properties} object from a file located on the classpath.
     *
     * @param resourceName the name of the resource file (e.g., {@code "application.properties"})
     * @return a {@link Properties} object containing all loaded key-value pairs
     * @throws IOException if the resource cannot be found or read
     */
    public static Properties loadFromClasspath(String resourceName) throws IOException {
        try (InputStream inputStream = PropertyUtils.class.getClassLoader().getResourceAsStream(resourceName)) {
            if (inputStream == null) {
                throw new IOException("Properties file not found in classpath: " + resourceName);
            }
            Properties properties = new Properties();
            properties.load(inputStream);
            return properties;
        }
    }

    /**
     * Loads a {@link Properties} object from a file located at the specified file system path.
     *
     * @param filePath the absolute or relative path to the properties file
     * @return a {@link Properties} object containing all loaded key-value pairs
     * @throws IOException if the file cannot be found or read
     */
    public static Properties loadFromFile(String filePath) throws IOException {
        try (InputStream inputStream = new FileInputStream(filePath)) {
            Properties properties = new Properties();
            properties.load(inputStream);
            return properties;
        }
    }

    /**
     * Retrieves a property value from a {@link Properties} object with an optional default value.
     *
     * @param properties  the {@link Properties} object containing the key-value pairs
     * @param key         the property key to look up
     * @param defaultValue the value to return if the key is not found
     * @return the property value, or {@code defaultValue} if the key does not exist
     */
    public static String getProperty(Properties properties, String key, String defaultValue) {
        if (properties == null || key == null) {
            return defaultValue;
        }
        return properties.getProperty(key, defaultValue);
    }

    /**
     * Retrieves a property value directly from a classpath properties file.
     *
     * @param resourceName the name of the classpath resource (e.g., {@code "config.properties"})
     * @param key          the property key to look up
     * @return the property value, or {@code null} if not found
     * @throws IOException if the resource cannot be read
     */
    public static String getPropertyFromClasspath(String resourceName, String key) throws IOException {
        Properties properties = loadFromClasspath(resourceName);
        return properties.getProperty(key);
    }
}
