package com.designpattern.Strategy.Encryption;

public class Sha256Encryption implements Encryption {
    @Override
    public String encrypt(String message) {
        System.out.println("Sha 256 encrption applied");
        return message + " Sha 256 Encrypted";
    }
}
