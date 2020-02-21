package com.designpattern.chainOfResponsibility.Exercise;

import com.designpattern.chainOfResponsibility.Handler;
import com.designpattern.chainOfResponsibility.HttpRequest;

public class ExcelSpreadSheet extends FormatHandler {
    public ExcelSpreadSheet(FormatHandler next) {
        super(next);
    }

    @Override
    protected boolean doFormat(Data data) {
        System.out.println("Excel spreadsheet improted");
        return false;
    }
}
