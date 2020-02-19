package com.designpattern.observer;

public class Chart implements Observer {
    private DataSource source;

    public Chart(DataSource source) {
        this.source = source;
    }

    @Override
    public void update() {
        System.out.println("Chart has been notified"+source.getValue());
    }
}
