package com.designpattern.bridge;

public class SamsungTv implements Device {
    @Override
    public void turnOn() {
        System.out.println("Samsung: turnon");
    }

    @Override
    public void turnOff() {
        System.out.println("Samsung: turnoff");
    }

    @Override
    public void setChannel(int number) {
        System.out.println("Samsung: channel "+number);
    }
}
