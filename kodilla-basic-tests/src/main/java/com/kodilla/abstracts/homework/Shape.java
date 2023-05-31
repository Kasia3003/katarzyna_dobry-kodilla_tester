package com.kodilla.abstracts.homework;

public abstract class Shape {
    private int area;
    private int circuit;

    public Shape(int area, int circuit) {
        this.area = area;
        this.circuit = circuit;
    }
    public abstract int getArea();
    public abstract int getCircuit();
}

