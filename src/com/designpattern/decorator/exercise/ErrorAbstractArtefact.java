package com.designpattern.decorator.exercise;

public class ErrorAbstractArtefact implements AbstractArtefact {
    private AbstractArtefact artefact;

    public ErrorAbstractArtefact(AbstractArtefact artefact) {
        this.artefact = artefact;
    }
    @Override
    public String render() {
        return artefact.render() + " [Error] ";
    }
}
