package org.example.eugen.prototype.shapes;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> copied = new ArrayList<>();

        Circle circle = new Circle();
        circle.setRadius(10);
        circle.setColor("RED");
        circle.setX(1);
        circle.setY(1);
        shapes.add(circle);

        Circle another = (Circle) circle.clone();
        shapes.add(another);

        Rectangle rectangle = new Rectangle();
        rectangle.height = 10;
        rectangle.width = 10;
        rectangle.setX(1);
        rectangle.setY(2);
        rectangle.setColor("YELLOW");
        shapes.add(rectangle);

        System.out.println(cloneAndCompare(shapes,copied));
    }

    private static boolean cloneAndCompare(List<Shape> shapes, List<Shape> copied) {
        for (Shape shape:shapes) {
            copied.add(shape.clone());
        }
        System.out.println(shapes);
        System.out.println(copied);
        return shapes.equals(copied);
    }
}
