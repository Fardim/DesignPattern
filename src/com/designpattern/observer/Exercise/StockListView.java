package com.designpattern.observer.Exercise;

import com.designpattern.observer.Observer;

public class StockListView implements Observer {
    private StockDataSource source;

    public StockListView(StockDataSource source) {
        this.source = source;
    }

    @Override
    public void update() {
        System.out.println("Stock list of the updated product "+ source.getPrice());
    }
}
