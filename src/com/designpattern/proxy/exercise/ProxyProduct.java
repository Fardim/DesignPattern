package com.designpattern.proxy.exercise;

public class ProxyProduct extends Product {

    private DbContext dbContext;

    public ProxyProduct(int id, DbContext dbContext) {
        super(id);
        this.dbContext = dbContext;
    }

    @Override
    public void setName(String name) {
        super.setName(name);
        dbContext.markAsChanged(this);
    }

}
