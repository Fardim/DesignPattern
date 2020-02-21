package com.designpattern.visitor.exercise;

public class NormalizeVisitor implements Visitor {
    @Override
    public void visit(WavFile wavFile) {
        System.out.println("Normalize-Wavfile");
    }

    @Override
    public void visit(MP3File mp3File) {
        System.out.println("Normalize-mp3");
    }
}
