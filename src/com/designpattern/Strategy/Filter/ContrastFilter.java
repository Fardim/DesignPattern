package com.designpattern.Strategy.Filter;

public class ContrastFilter implements Filter {
    @Override
    public void apply(String fileName) {
        System.out.println("Contrast filter applied");
    }
}
