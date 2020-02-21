package com.designpattern.chainOfResponsibility.Exercise;

import com.designpattern.chainOfResponsibility.Handler;
import com.designpattern.chainOfResponsibility.HttpRequest;

public class Quickbook extends FormatHandler {
    public Quickbook(FormatHandler next) {
        super(next);
    }

    @Override
    protected boolean doFormat(Data data) {
        System.out.println("Quik book imported");
        return false;
    }
}
