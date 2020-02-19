package com.designpattern.observer;

public class SpreadSheet implements Observer {
    private DataSource source;

    public SpreadSheet(DataSource source) {
        this.source = source;
    }

    @Override
    public void update() {
        System.out.println("Spread sheet has been notified"+ source.getValue());
    }
}
