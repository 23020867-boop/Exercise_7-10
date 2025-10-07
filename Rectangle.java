package org.example;

public class Rectangle extends Shape {
    private double height;
    private double length;

    public Rectangle(Point centerPoint, double height, double length) {
        super(centerPoint);
        this.height = height;
        this.length = length;
        Shape.shapesList.add(this);
        Shape.pointsList.add(centerPoint);
    }

    public String getDetails() {
        return "Rectengle:height=" + height + "length=" + length;
    }
}
