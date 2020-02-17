package com.designpattern;

public abstract class UIControl {
    public void enable() {
        System.out.println("enabled");
    }
    public void disable() {
        System.out.println("disable");
    }
    public abstract void draw();
}
