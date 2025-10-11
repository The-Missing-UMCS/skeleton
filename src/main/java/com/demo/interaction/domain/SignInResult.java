package com.demo.interaction.domain;

public record SignInResult(
    boolean success
) implements UIResult {

    public static SignInResult successful() {
        return new SignInResult(true);
    }

    public static SignInResult failure() {
        return new SignInResult(false);
    }

    @Override
    public boolean isSuccessful() {
        return success;
    }

    @Override
    public boolean isFailure() {
        return !success;
    }
}
