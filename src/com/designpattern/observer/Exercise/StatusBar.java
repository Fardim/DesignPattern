package com.designpattern.observer.Exercise;

import com.designpattern.observer.Observer;

public class StatusBar implements Observer {
    private StockDataSource source;

    public StatusBar(StockDataSource source) {
        this.source = source;
    }
    @Override
    public void update() {
        System.out.println("Printing the Status bar of top products "+ source.getPrice());
    }
}
