package com.mycompany.HorstmannTasks.ch04;

public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(Point topLeft, double width, double height) {
        super(topLeft);
        this.width = width;
        this.height = height;
    }


    @Override
    public Point getCenter() {
        return new Point((super.point.x + width) / 2 , (super.point.y + height) / 2);
    }
}
