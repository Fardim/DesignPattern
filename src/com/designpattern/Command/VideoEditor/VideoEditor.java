package com.designpattern.Command.VideoEditor;

public class VideoEditor {
    private String label;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void changeSize(int size) {
        this.size = size;
    }

    private int size;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
    public void changeLabel(String label) {
        this.label = label;
    }
}
