package com.designpattern.visitor.exercise;

public class MP3File implements AudioFile {
    @Override
    public void execute(Visitor visitor) {
        visitor.visit(this);
    }
}
