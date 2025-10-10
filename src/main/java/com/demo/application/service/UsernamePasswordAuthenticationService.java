package com.demo.application.service;

/**
 * Service interface for authenticating users based on username and password credentials.
 * <p>
 * Implementations of this interface should validate user credentials,
 * typically by comparing an encoded version of the provided password
 * against stored credentials.
 */
public interface UsernamePasswordAuthenticationService {

    /**
     * Authenticates a user with the given username and password.
     *
     * @param username the username to authenticate; must not be {@code null} or empty
     * @param password the plain-text password to verify; must not be {@code null} or empty
     * @throws SecurityException         if authentication fails due to invalid credentials
     * @throws IllegalArgumentException  if any argument is {@code null} or empty
     */
    void authenticate(String username, String password);
}