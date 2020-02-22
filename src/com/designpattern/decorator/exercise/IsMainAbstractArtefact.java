package com.designpattern.decorator.exercise;

public class IsMainAbstractArtefact implements AbstractArtefact {
    private AbstractArtefact artefact;

    public IsMainAbstractArtefact(AbstractArtefact artefact) {
        this.artefact = artefact;
    }

    @Override
    public String render() {
        String mainIcon = artefact.render();
        return mainIcon + " [Main] ";
    }

}
