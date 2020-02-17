package com.designpattern.Template.Exercise;

public abstract class Window {
    private BeforeCloseTask beforeCloseTask;

    public Window(BeforeCloseTask beforeCloseTask) {

        this.beforeCloseTask = beforeCloseTask;
    }

    public void closeWindow() {
        this.beforeCloseTask.close();
        this.doClose();
    }

    protected abstract void doClose();
}
