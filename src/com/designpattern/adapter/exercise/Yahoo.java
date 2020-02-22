package com.designpattern.adapter.exercise;

public class Yahoo implements EmailProvider {
    @Override
    public void downloadEmails() {
        System.out.println("Downloading yahoo mail");
    }
}
