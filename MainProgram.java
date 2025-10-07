package org.example;

import java.sql.SQLOutput;

public class MainProgram {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(new Point(1,1),5, 6);
        Rectangle r2 = new Rectangle(new Point(1,2),7,8);
        Square s1 = new Square(new Point(2,3), 5);
        Circle c1 = new Circle(new Point(0,0), 5);
        System.out.println(Shape.getTotalShape());
        System.out.println("Danh sach hinh:");
        for(Shape tem: Shape.shapesList){
            System.out.println(tem.getDetails());
        }
        System.out.println("Danh sach tam:");
        for(Point tem: Shape.pointsList){
            System.out.println(tem.toString());
        }
    }
}
