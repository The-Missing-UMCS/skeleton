package com.demo.interaction.ui;

import com.demo.interaction.domain.LoginResult;
import com.demo.interaction.domain.LoginTypeEnum;
import com.demo.interaction.domain.SignInResult;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LoginUI implements UserInterface<LoginResult> {

    private final SignInUI signInUI;
    private final SignUpUI signUpUI;

    public LoginResult run() {
        while (true) {
            LoginTypeEnum loginType = LoginTypeEnum.valueOf(System.getProperty("loginType"));
            if (loginType == LoginTypeEnum.SIGN_UP) {
                signUpUI.run();
                continue;
            }
            SignInResult signInResult = signInUI.run();
            return signInResult.isSuccessful()
                   ? LoginResult.successful()
                   : LoginResult.failure();
        }
    }
}
