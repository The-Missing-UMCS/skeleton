package com.demo.interaction.domain;

public record LoginResult(
    boolean success
) implements UIResult {

    public static LoginResult successful() {
        return new LoginResult(true);
    }

    public static LoginResult failure() {
        return new LoginResult(false);
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
