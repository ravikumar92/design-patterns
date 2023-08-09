package com.java.factory;

public class MacButton implements Button {

    public void createButton() {
        System.out.println("Button create for MACOS");
    }

    public void renderButton() {
        System.out.println("Button rendered for MACOS");
    }
}
