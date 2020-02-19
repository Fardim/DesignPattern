package com.designpattern.observer.Exercise;

import com.designpattern.observer.Subject;

import java.util.List;

public class StockDataSource extends Subject {
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
        notifyObservers();
    }


}
