package oop.polymorphism;

public class PolymorphismDemo {
    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        Shapes triangle = new Triangle();
        Shapes circle = new Circle();

        shapes.area();
        triangle.area();
        shapes.area();
        circle.area();
    }
}
