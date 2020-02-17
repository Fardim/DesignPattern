package com.designpattern.Strategy.Filter;

public class BlackAndWhiteFilter implements Filter {
    @Override
    public void apply(String fileName) {
        System.out.println("B&W filter applied");
    }
}
