package com.designpattern.visitor.exercise;

public class WavFile implements AudioFile {
    @Override
    public void execute(Visitor visitor) {
        visitor.visit(this);
    }
}
