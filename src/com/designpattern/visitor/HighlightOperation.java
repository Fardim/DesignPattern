package com.designpattern.visitor;

public class HighlightOperation implements Operation {
    @Override
    public void apply(HeadingNode heading) {
        System.out.println("highlighting heading node");
    }

    @Override
    public void apply(AnchorNode anchor) {
        System.out.println("highlighting anchor node");
    }
}
