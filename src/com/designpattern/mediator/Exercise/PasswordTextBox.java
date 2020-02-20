package com.designpattern.mediator.Exercise;

public class PasswordTextBox extends UIControl {
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        notifyObservers();
    }
}
