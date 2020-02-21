package com.designpattern.chainOfResponsibility.Exercise;

import com.designpattern.chainOfResponsibility.Handler;
import com.designpattern.chainOfResponsibility.HttpRequest;

public class NumberSpreadSheet extends FormatHandler {
    public NumberSpreadSheet(FormatHandler next) {
        super(next);
    }

    @Override
    protected boolean doFormat(Data data) {
        System.out.println("Number spread sheet imported");
        return false;
    }
}
