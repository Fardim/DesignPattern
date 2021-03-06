package com.designpattern.Command.Undoable;

import com.designpattern.Command.Fx.Command;

public class UndoCommand implements Command {
    History history;

    public UndoCommand(History history) {
        this.history = history;
    }

    @Override
    public void execute() {
        if(this.history.size() > 0)
            this.history.pop().unexecute();
    }
}
