package com.designpattern.visitor.exercise;

public class NoiseReductionVisitor implements Visitor {

    @Override
    public void visit(WavFile wavFile) {
        System.out.println("WavFile-NoiseRedution");
    }

    @Override
    public void visit(MP3File mp3File) {
        System.out.println("MP3-NoiseReductio");

    }
}
