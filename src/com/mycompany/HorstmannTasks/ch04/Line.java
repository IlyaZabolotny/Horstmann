package com.mycompany.HorstmannTasks.ch04;

public class Line extends Shape {

    private Point to;

    public Line(Point from, Point to) {
        super(from);
        this.to = to;
    }

    @Override
    public Point getCenter() {
        return new Point((super.point.x + to.getX()) / 2, (super.point.getY() + to.getY()) / 2);
    }
}
