package com.designpattern.mediator.Exercise;

public class UsernameTextBox extends UIControl {
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
        notifyObservers();
    }
}
