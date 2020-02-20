package com.designpattern.mediator.Exercise;

public class TermsCheckBox extends UIControl {
    private boolean termsChecked;

    public boolean isTermsChecked() {
        return termsChecked;
    }

    public void setTermsChecked(boolean termsChecked) {
        this.termsChecked = termsChecked;
        notifyObservers();
    }
}
