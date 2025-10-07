package org.example;

public class Circle extends Shape {
    private double radius;

    public Circle(Point centerPoint, double radius) {
        super(centerPoint);
        this.radius = radius;
        Shape.shapesList.add(this);
        Shape.pointsList.add(centerPoint);
    }

    public String getDetails() {
        return "Cirlce:radius=" + radius;
    }
}
