package com.designpattern.proxy;

public class LoggingEbookProxy implements Ebook {
    private String fileName;
    private RealEbook realEbook;

    public LoggingEbookProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void show() {
        if(realEbook == null) {
            realEbook = new RealEbook(fileName);
        }
        System.out.println("Loggin the ebook "+fileName);
        realEbook.show();
    }

    @Override
    public String getFileName() {
        return fileName;
    }
}
