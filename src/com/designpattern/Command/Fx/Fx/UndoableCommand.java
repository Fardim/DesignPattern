package com.designpattern.Command.Fx.Fx;

public interface UndoableCommand extends Command {
    void unexecute();
}
