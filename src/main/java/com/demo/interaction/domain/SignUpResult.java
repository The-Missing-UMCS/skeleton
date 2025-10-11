package com.demo.interaction.domain;

public record SignUpResult(
    boolean success
) implements UIResult {

    @Override
    public boolean isSuccessful() {
        return success;
    }

    @Override
    public boolean isFailure() {
        return !success;
    }
}
