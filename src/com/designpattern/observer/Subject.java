package com.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observerList = new ArrayList<Observer>();

    public void addObserver(Observer obs) {
        observerList.add(obs);
    }

    public void removeObserver(Observer obs) {
        observerList.remove(obs);
    }

    public void notifyObservers() {
        for (Observer obs: observerList) {
            obs.update();
        }
    }
}
