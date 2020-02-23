package com.designpattern.flyweight;

import java.util.ArrayList;
import java.util.List;

public class PointService {
    private PointIconFactory factory;

    public PointService(PointIconFactory factory) {
        this.factory = factory;
    }

    public List<Point> getPoints() {
        List<Point> points = new ArrayList<Point>();
        Point point = new Point(12343, 435454, factory.getPointIcon(PointType.RESTAURANT));
        points.add(point);
        return points;
    }
}
