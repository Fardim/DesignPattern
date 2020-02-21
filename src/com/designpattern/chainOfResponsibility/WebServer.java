package com.designpattern.chainOfResponsibility;

public class WebServer {
    private Handler handler;

    public WebServer(Handler handler) {
        this.handler = handler;
    }

    public void handle(HttpRequest request) {
        this.handler.handle(request);
    }
}
