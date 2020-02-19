package com.designpattern.Command.Undoable;

import com.designpattern.Command.Fx.UndoableCommand;

import java.util.ArrayDeque;
import java.util.Deque;

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
