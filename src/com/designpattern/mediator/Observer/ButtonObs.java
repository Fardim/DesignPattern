package com.designpattern.mediator.Observer;

public class ButtonObs extends UIControlObs {
    private boolean isEnabled;

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
        notifyObservers();
    }
}
