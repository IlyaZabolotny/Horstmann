package com.mycompany.HorstmannTasks.ch02;

public final class Point {

    private final double x;
    private final double y;

    public Point() {
        x = 0.0;
        y = 0.0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point translate(double x, double y) {
        double newX = this.x + x;
        double newY = this.y + y;
        Point p = new Point(newX, newY);
        return p;
    }

    public Point scale(double factor) {
        double newX = x * factor;
        double newY = y * factor;
        Point p = new Point(newX, newY);
        return p;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
