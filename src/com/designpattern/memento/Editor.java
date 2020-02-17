package com.designpattern.memento;

import java.util.ArrayList;
import java.util.List;

public class Editor {
    private String content;
//    private List<String> contentArray = new ArrayList<String>();
    public EditorState createState() {
        return new EditorState(content);
    }
    public void restore(EditorState state) {
        content = state.getContent();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public void undo() {

    }
}
