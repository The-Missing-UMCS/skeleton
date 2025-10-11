package com.demo.interaction;

import com.demo.interaction.domain.LoginResult;
import com.demo.interaction.ui.LoginUI;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AppRunner {

    private final LoginUI loginUI;

    public void run() {
        while (true) {
            LoginResult loginResult = loginUI.run();
            if (loginResult.isFailure()) {
                continue;
            }
        }


    }
}
