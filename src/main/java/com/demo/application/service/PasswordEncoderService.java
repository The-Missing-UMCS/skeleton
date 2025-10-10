package com.demo.application.service;

/**
 * Service interface for handling password encoding and decoding operations.
 * <p>
 * Implementations of this interface should provide secure mechanisms for
 * encoding plain-text passwords and, if applicable, decoding them for verification.
 * <p>
 * Note: In most secure systems, passwords are hashed (one-way) rather than decoded.
 * The {@link #decode(String)} method may be implemented as a no-op or throw an
 * {@link UnsupportedOperationException} depending on the security policy.
 */
public interface PasswordEncoderService {

    /**
     * Encodes the given plain-text password into a secure form suitable for storage.
     *
     * @param plainText the plain-text password to encode; must not be {@code null}
     * @return the encoded (typically hashed) password string; never {@code null}
     * @throws IllegalArgumentException if the input is invalid or empty
     */
    String encode(String plainText);

    /**
     * Decodes the given encoded password back into plain text.
     * <p>
     * This method is typically not implemented in secure one-way hash systems.
     *
     * @param cipherText the encoded password to decode; must not be {@code null}
     * @return the decoded plain-text password, if supported
     * @throws UnsupportedOperationException if decoding is not supported
     */
    String decode(String cipherText);
}
