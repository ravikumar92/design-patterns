package com.java.factory;

public class Factory {
    public static void main(String[] args) {
        ButtonManger buttonManger = new ButtonManger();
        Button mac = buttonManger.getButton("Mac");
        mac.createButton();
        mac.renderButton();
        Button windows = buttonManger.getButton("Win");
        windows.createButton();
        windows.renderButton();
    }
}
