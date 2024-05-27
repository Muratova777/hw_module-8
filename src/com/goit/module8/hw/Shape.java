package com.goit.module8.hw;

public abstract class Shape implements Printable {

    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name);
    }
}
