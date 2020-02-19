package com.designpattern.Command.Fx;

public interface UndoableCommand extends Command {
    void unexecute();
}
