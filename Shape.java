package org.example;

import java.util.ArrayList;

public abstract class Shape {
    private static int totalShape = 0;
    protected Point centerPoint;
    protected static ArrayList<Point> pointsList = new ArrayList<>();
    protected static ArrayList<Shape> shapesList = new ArrayList<>();
    public Shape (Point centerPoint){
        this.centerPoint = centerPoint;
        totalShape++;
    }

    public Point getCenterPoint() {
        return centerPoint;
    }
    public static int getTotalShape(){
        return totalShape;
    }
    public abstract String getDetails();
}
