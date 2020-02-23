package com.designpattern.proxy;

public class ProxyEbook implements Ebook {
    private RealEbook realEbook;
    private String fileName;

    public ProxyEbook(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void show() {
        if(realEbook == null) {
            realEbook = new RealEbook(fileName);
        }
        realEbook.show();
    }

    @Override
    public String getFileName() {
        return fileName;
    }
}
