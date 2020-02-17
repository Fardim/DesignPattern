package com.designpattern.Strategy.Compressor;

public class JpegCompressor implements Compressor {
    @Override
    public void compress(String fileName) {
        System.out.println(fileName + " Jpeg compression is going on...");
    }
}
