package com.designpattern.mediator.Observer;

public class ListBoxObs extends UIControlObs {
    private String selection;

    public String getSelection() {
        return selection;
    }

    public void setSelection(String selection) {
        this.selection = selection;
        notifyObservers();
    }
}
