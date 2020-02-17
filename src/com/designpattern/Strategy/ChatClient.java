package com.designpattern.Strategy;

import com.designpattern.Strategy.Encryption.Encryption;

public class ChatClient {
    public void sendMessage(String message, Encryption enc ) {
        String encrypted = enc.encrypt(message);
        System.out.println("Sender: "+ encrypted);
    }
}
