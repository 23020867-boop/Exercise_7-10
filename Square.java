package org.example;

public class Square extends Shape {
    private double side;

    public Square(Point centerPoint, double side) {
        super(centerPoint);
        this.side = side;
        Shape.shapesList.add(this);
        Shape.pointsList.add(centerPoint);
    }

    public String getDetails() {
        return "Square:side=" + side;
    }
}
