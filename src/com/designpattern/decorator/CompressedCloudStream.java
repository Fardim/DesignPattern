package com.designpattern.decorator;

public class CompressedCloudStream implements Stream {
    private Stream stream;

    public CompressedCloudStream(Stream stream) {
        this.stream = stream;
    }
    @Override
    public void write(String data) {
        String compressed = compress(data);
        System.out.println("Compressed "+compressed);
        this.stream.write(compressed);
    }
    private String compress(String data) {
        return data.substring(0, 5);
    }
}
