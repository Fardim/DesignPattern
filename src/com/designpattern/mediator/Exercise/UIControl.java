package com.designpattern.mediator.Exercise;

import java.util.ArrayList;
import java.util.List;

public class UIControl {
    private List<Observer> observers = new ArrayList<Observer>();

    public void attachObserver(Observer obs) {
        observers.add(obs);
    }

    public void deleteObserver(Observer obs) {
        observers.remove(obs);
    }

    protected void notifyObservers() {
        for (Observer obs: observers) {
            obs.update();
        }
    }
}
