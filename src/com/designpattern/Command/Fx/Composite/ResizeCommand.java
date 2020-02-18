package com.designpattern.Command.Fx.Composite;

import com.designpattern.Command.Fx.Fx.Command;

public class ResizeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Resize the image");
    }
}
