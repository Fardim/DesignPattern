package com.designpattern.Command.VideoEditor;

import com.designpattern.Command.Fx.UndoableCommand;
import com.designpattern.Command.Undoable.History;

public class AddLabelCommand implements UndoableCommand {
    private String prevLabel;
    private History history;
    private VideoEditor videoEditor;
    private String newLabel;


    public String getNewLabel() {
        return newLabel;
    }

    public void setNewLabel(String newLabel) {
        this.newLabel = newLabel;
    }

    public AddLabelCommand(History history, VideoEditor videoEditor) {
        this.history = history;
        this.videoEditor = videoEditor;
    }

    @Override
    public void unexecute() {
        this.videoEditor.setLabel(this.prevLabel);
    }

    @Override
    public void execute() {
        this.prevLabel = videoEditor.getLabel();
        videoEditor.setLabel(this.newLabel);
        history.push(this);
    }
}
