package com.designpattern.chainOfResponsibility;

public class Logger extends Handler {
    public Logger(Handler handler) {
        super(handler);
    }

    @Override
    protected boolean doHandle(HttpRequest request) {
        System.out.println("Log handler");
        return false;
    }
}
