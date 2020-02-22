package com.designpattern.composite.exercise;

import java.util.ArrayList;
import java.util.List;

public class Team implements IncidentComponent {
    private List<IncidentComponent> components = new ArrayList<IncidentComponent>();

    public void add(IncidentComponent component) {
        components.add(component);
    }
    @Override
    public void deploy() {
        for (IncidentComponent component: components) {
            component.deploy();
        }
    }
}
