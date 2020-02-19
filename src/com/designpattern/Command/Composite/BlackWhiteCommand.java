package com.designpattern.Command.Composite;

import com.designpattern.Command.Fx.Command;

public class BlackWhiteCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Black & white command");
    }
}
