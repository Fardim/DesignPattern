package com.designpattern.Template.Exercise;

public class ModalWindow extends Window {

    public ModalWindow(BeforeCloseTask beforeCloseTask) {
        super(beforeCloseTask);
    }

    @Override
    protected void doClose() {
        System.out.println("Closing the modal window finally");
    }
}
