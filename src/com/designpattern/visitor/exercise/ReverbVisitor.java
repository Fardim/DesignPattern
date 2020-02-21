package com.designpattern.visitor.exercise;

public class ReverbVisitor implements Visitor {
    @Override
    public void visit(WavFile wavFile) {
        System.out.println("Reverb-WavFile");
    }

    @Override
    public void visit(MP3File mp3File) {
        System.out.println("Reverb-MP3File");
    }
}
