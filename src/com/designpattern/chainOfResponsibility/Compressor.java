package com.designpattern.chainOfResponsibility;

public class Compressor extends Handler {

    public Compressor(Handler next) {
        super(next);
    }

    @Override
    protected boolean doHandle(HttpRequest request) {
        System.out.println("Compressor handled");
        return false;
    }
}
