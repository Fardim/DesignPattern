package com.designpattern.mediator.Observer;

import java.util.ArrayList;
import java.util.List;

//Subject
public abstract class UIControlObs {
    private List<Observer> observers = new ArrayList<Observer>();

    public void addEventHandler(Observer obs) {
        observers.add(obs);
    }

    public void deleteObserver(Observer obs) {
        observers.remove(obs);
    }

    protected void notifyObservers() {
        for (Observer obs: observers) {
            obs.handle();
        }
    }
}
