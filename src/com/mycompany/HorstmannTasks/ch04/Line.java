package com.mycompany.HorstmannTasks.ch04;

public class Line extends Shape implements Cloneable {

    private Point to;

    public Line(Point from, Point to) {
        super(from);
        this.to = to;
    }

    @Override
    public Point getCenter() {
        return new Point((super.point.x + to.getX()) / 2, (super.point.getY() + to.getY()) / 2);
    }

    @Override
    public Line clone() {
        try{
            Line cloned = (Line) super.clone();
            cloned.point = new Point(point.getX(), point.getY());
            cloned.to = new Point(to.getX(), to.getY());
            return cloned;
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }
}
