package com.designpattern.Template.Exercise;

public class MessageWindow extends Window {
    public MessageWindow(BeforeCloseTask beforeCloseTask) {
        super(beforeCloseTask);
    }

    @Override
    protected void doClose() {
        System.out.println("finally close the message window");
    }
}
