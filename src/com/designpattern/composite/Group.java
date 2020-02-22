package com.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Group implements Component {
    private List<Component> leafs = new ArrayList<Component>();

    public void add(Component leaf) {
        leafs.add(leaf);
    }

    public void render() {
        for (Component leaf: leafs) {
            leaf.render();
        }
    }

    public void move() {
        for (Component leaf: leafs) {
            leaf.move();
        }
    }
}
