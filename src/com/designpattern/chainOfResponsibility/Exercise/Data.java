package com.designpattern.chainOfResponsibility.Exercise;

public class Data {
    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    private byte[] data;

    public Data(byte[] data) {
        this.data = data;
    }

}
