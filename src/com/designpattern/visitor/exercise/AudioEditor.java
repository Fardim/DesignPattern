package com.designpattern.visitor.exercise;

import java.util.ArrayList;
import java.util.List;

public class AudioEditor {
    private List<AudioFile> audioFiles = new ArrayList<AudioFile>();

    public void add(AudioFile file) {
        audioFiles.add(file);
    }

    public void execute(Visitor visitor) {
        for (AudioFile audioFile: audioFiles) {
            audioFile.execute(visitor);
        }
    }
}
