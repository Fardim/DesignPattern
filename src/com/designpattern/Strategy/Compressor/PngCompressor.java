package com.designpattern.Strategy.Compressor;

public class PngCompressor implements Compressor {
    @Override
    public void compress(String fileName) {
        System.out.println(fileName + "PNG Compression is going on...");
    }
}
