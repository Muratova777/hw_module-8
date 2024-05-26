package com.goit.module8.hw;

public class Printer {
    void print(Shape shape) {
        shape.print();
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        Quad quad = new Quad();
        Cube cube = new Cube();
        Trapezium trapezium = new Trapezium();
        Triangle triangle = new Triangle();

        Printer printer = new Printer();
        printer.print(circle);
        printer.print(quad);
        printer.print(cube);
        printer.print(trapezium);
        printer.print(triangle);
    }
}
