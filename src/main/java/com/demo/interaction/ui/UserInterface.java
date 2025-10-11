package com.demo.interaction.ui;

import com.demo.interaction.domain.UIResult;

@FunctionalInterface
public interface UserInterface<T extends UIResult> {

    T run();
}
