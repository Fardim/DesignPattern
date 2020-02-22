package com.designpattern.composite;

public class Shape implements Component {
    public void render() {
        System.out.println("Rendered the shape");
    }

    @Override
    public void move() {
        System.out.println("Shape moved");
    }
}
