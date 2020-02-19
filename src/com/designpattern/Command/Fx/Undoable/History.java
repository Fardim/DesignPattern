package com.designpattern.Command.Fx.Undoable;

import com.designpattern.Command.Fx.Fx.Command;
import com.designpattern.Command.Fx.Fx.UndoableCommand;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class History {
    private Deque<UndoableCommand> commands = new ArrayDeque<UndoableCommand>();

    public void push(UndoableCommand cmd) {
        commands.add(cmd);
    }

    public UndoableCommand pop() {
        return commands.pop();
    }

    public int size() {
        return commands.size();
    }
}
