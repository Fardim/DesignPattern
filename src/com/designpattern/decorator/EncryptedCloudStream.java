package com.designpattern.decorator;

public class EncryptedCloudStream implements Stream {
    private Stream stream;

    public EncryptedCloudStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        String encrypted = encrypt(data);
        System.out.println("Encrypted "+ encrypted);
        this.stream.write(encrypted);
    }

    private String encrypt(String data) {
        return "!@#$"+data+"%^&*";
    }
}
