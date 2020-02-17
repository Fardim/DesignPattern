package com.designpattern.Strategy.Encryption;

public class Sha1Encryption implements Encryption {
    @Override
    public String encrypt(String message) {
        System.out.println("Sha 1 encrption");
        return message + " Sha 1 Encrypted";
    }
}
