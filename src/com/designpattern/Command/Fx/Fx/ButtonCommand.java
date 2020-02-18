package com.designpattern.Command.Fx.Fx;

public class ButtonCommand {
    private Command command;

    public ButtonCommand(Command command) {
        this.command = command;
    }

    public void click() {
        this.command.execute();
    }
}
