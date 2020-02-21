package com.designpattern.chainOfResponsibility.Exercise;

import com.designpattern.chainOfResponsibility.Handler;

public class DataReader {
    private FormatHandler handler;

    public DataReader(FormatHandler handler) {
        this.handler = handler;
    }

    public void importData(Data data) {
        this.handler.format(data);
    }
}
