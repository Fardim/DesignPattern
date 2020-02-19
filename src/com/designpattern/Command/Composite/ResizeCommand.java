package com.designpattern.Command.Composite;

import com.designpattern.Command.Fx.Command;

public class ResizeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Resize the image");
    }
}
