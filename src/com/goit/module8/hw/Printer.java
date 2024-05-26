package com.goit.module8.hw;

public class Printer {
    void print(Shape shape) {
        shape.print();
    }

    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape quad = new Quad();
        Shape cube = new Cube();
        Shape trapezium = new Trapezium();
        Shape triangle = new Triangle();

        Printer printer = new Printer();
        printer.print(circle);
        printer.print(quad);
        printer.print(cube);
        printer.print(trapezium);
        printer.print(triangle);
    }
}
