package com.java.factory;

public class ButtonManger {
    public Button getButton(String os) {
        if(os == "Mac") {
            return new MacButton();
        } else if(os == "Win") {
            return new WindowButton();
        } else {
            return null;
        }
    }
}
