package com.designpattern.Command.Composite;

import com.designpattern.Command.Fx.Command;

import java.util.ArrayList;
import java.util.List;

public class CompositeCommand implements Command {
    public List<Command> commands = new ArrayList<Command>();

    public void add(Command command) {
        commands.add(command);
    }

    @Override
    public void execute() {
        for (Command command: commands) {
            command.execute();
        }
    }
}
