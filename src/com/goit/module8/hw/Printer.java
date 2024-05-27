package com.goit.module8.hw;

public class Printer {
    void print(Shape shape) {
        shape.print();
    }

    public static void main(String[] args) {
        Shape circle = new Circle("Circle");
        Shape quad = new Quad("Quad ");
        Shape cube = new Cube("Cube");
        Shape trapezium = new Trapezium("Trapezium");
        Shape triangle = new Triangle("Triangle");

        Printer printer = new Printer();
        printer.print(circle);
        printer.print(quad);
        printer.print(cube);
        printer.print(trapezium);
        printer.print(triangle);
    }

}
