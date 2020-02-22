package com.designpattern.decorator.exercise;

public class Editor {
    public void openProject(String path) {
        AbstractArtefact[] artefacts = {
                new Artefact("Main"),
                new Artefact("Demo"),
                new Artefact("EmailClient"),
                new Artefact("EmailProvider"),
        };

        artefacts[0] = new ErrorAbstractArtefact(new IsMainAbstractArtefact(artefacts[0]));
        artefacts[1] = new ErrorAbstractArtefact(artefacts[1]);
        for (AbstractArtefact artefact : artefacts)
            System.out.println(artefact.render());
    }
}
