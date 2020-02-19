package com.designpattern.Command.Fx.Undoable;

public class Document {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void makeBold() {
        this.content = "<b>"+this.content+"</b>";
    }

}
