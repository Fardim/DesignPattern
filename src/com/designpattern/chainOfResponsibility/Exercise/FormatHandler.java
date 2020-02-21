package com.designpattern.chainOfResponsibility.Exercise;

public abstract class FormatHandler {
    private FormatHandler next;

    public FormatHandler(FormatHandler next) {
        this.next = next;
    }

    public void format(Data data) {
        if(doFormat(data)) {
            return;
        }
        if(this.next != null)
            this.next.format(data);

    }

    protected abstract boolean doFormat(Data data);
}
