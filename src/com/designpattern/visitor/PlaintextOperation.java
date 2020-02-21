package com.designpattern.visitor;

public class PlaintextOperation implements Operation {
    @Override
    public void apply(HeadingNode heading) {
        System.out.println("Heading-Plaintext");
    }

    @Override
    public void apply(AnchorNode anchor) {
        System.out.println("Anchor-Plaintext");
    }
}
