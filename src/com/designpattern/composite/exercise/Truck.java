package com.designpattern.composite.exercise;

public class Truck implements IncidentComponent {
    @Override
    public void deploy() {
        System.out.println("Truck deployed");
    }
}
