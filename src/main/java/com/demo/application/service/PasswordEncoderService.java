package com.demo.application.service;

public interface PasswordEncoderService {

    String encode(String plainText);

    String decode(String cipherText);
}
