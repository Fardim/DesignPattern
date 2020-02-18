package com.designpattern.Command.Fx.Composite;

import com.designpattern.Command.Fx.Fx.Command;

public class BlackWhiteCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Black & white command");
    }
}
