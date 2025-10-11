package com.demo.interaction.ui;

import com.demo.application.service.UsernamePasswordAuthenticationService;
import com.demo.interaction.domain.SignInResult;
import com.demo.utils.InputUtils;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SignInUI implements UserInterface<SignInResult> {

    private final UsernamePasswordAuthenticationService usernamePasswordAuthenticationService;
    private final int TRIAL_LIMIT = 3;

    @Override
    public SignInResult run() {
        for (int i = 0; i < TRIAL_LIMIT; i++) {
            String username = InputUtils.getStringInput("Enter your username: ");
            String password = InputUtils.getStringInput("Enter your password: ");
            try {
                usernamePasswordAuthenticationService.authenticate(username, password);
                return SignInResult.successful();
            } catch (SecurityException e) {
                System.out.println("Invalid username or password");
            }
        }
        return SignInResult.failure();
    }
}
