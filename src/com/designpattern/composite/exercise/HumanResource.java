package com.designpattern.composite.exercise;

public class HumanResource implements IncidentComponent {
    @Override
    public void deploy() {
        System.out.println("Human resource deployed");
    }
}
