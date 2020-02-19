package com.designpattern.Command.Fx.VideoEditor;

import com.designpattern.Command.Fx.Fx.UndoableCommand;
import com.designpattern.Command.Fx.Undoable.History;

public class VideoResizeCommand implements UndoableCommand {

    private History history;
    private VideoEditor videoEditor;
    private int prevSize;
    private int newSize;

    public VideoResizeCommand(History history, VideoEditor videoEditor) {
        this.history = history;
        this.videoEditor = videoEditor;
    }

    public int getNewSize() {
        return newSize;
    }

    public void setNewSize(int newSize) {
        this.newSize = newSize;
    }

    @Override
    public void unexecute() {
        this.videoEditor.setSize(this.prevSize);
    }

    @Override
    public void execute() {
        this.prevSize = this.videoEditor.getSize();
        videoEditor.setSize(this.newSize);
        this.history.push(this);
    }
}
