package com.designpattern.visitor.exercise;

public interface Visitor {
    void visit(WavFile wavFile);
    void visit(MP3File mp3File);
}
