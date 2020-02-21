package com.designpattern.chainOfResponsibility;

public class Authenticator extends Handler {
    public Authenticator(Handler handler) {
        super(handler);
    }

    @Override
    protected boolean doHandle(HttpRequest request) {
        boolean isValid = (request.getPassword() =="1234" && request.getUsername()=="fardim");
        System.out.println("Authentication");
        return !isValid;
    }
}
