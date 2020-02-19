package com.designpattern.Command.Undoable;

import com.designpattern.Command.Fx.UndoableCommand;

public class BoldCommand implements UndoableCommand {

    private String prevContent;
    private Document doc;
    private History history;

    public BoldCommand(Document doc, History history) {
        this.doc = doc;
        this.history = history;
    }

    @Override
    public void unexecute() {
        this.doc.setContent(this.prevContent);
    }

    @Override
    public void execute() {
        this.prevContent= doc.getContent();
        doc.makeBold();
        history.push(this);
    }
}
