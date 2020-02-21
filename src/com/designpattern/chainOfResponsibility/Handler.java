package com.designpattern.chainOfResponsibility;

public abstract class Handler {
    private Handler next;

    public Handler(Handler next) {
        this.next = next;
    }

    public void handle(HttpRequest request) {
        if(doHandle(request)) {
            return;
        }

        if(next != null)
            this.next.handle(request);
    }

    //Similar to template pattern
    protected abstract boolean doHandle(HttpRequest request);
}
