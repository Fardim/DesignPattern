package com.designpattern.bridge;

public class SonyTv implements Device {
    @Override
    public void turnOn() {
        System.out.println("SonyTv: TurnOn ");
    }

    @Override
    public void turnOff() {
        System.out.println("SonyTv: TurnOff");
    }

    @Override
    public void setChannel(int number) {
        System.out.println("SonyTv channel: "+number);
    }
}
