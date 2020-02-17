package com.designpattern;

public class MailService {
    public void sendEmail() {
        connect(400);
        authenticate();
        disconeect();
    }
    private void connect(int timeout) {
        System.out.println("connect");
    }
    private void disconeect() {
        System.out.println("disconnect");
    }
    private void authenticate() {
        System.out.println("Authenticate");
    }
}
