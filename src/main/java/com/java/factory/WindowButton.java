package com.java.factory;

public class WindowButton implements  Button {
        public void createButton() {
            System.out.println("Button create for Windows");
        }

        public void renderButton() {
            System.out.println("Button rendered for Windows");
        }
}
