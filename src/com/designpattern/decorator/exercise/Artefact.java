package com.designpattern.decorator.exercise;

public class Artefact implements AbstractArtefact {
    private String name;
    private boolean hasError;
    private boolean isMain;

    public Artefact(String name) {
        this.name = name;
    }

    @Override
    public String render() {
        return this.name;
    }
}
