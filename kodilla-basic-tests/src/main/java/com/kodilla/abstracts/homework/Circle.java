package com.kodilla.abstracts.homework;

public class Circle extends Shape {

    public Circle() {
        super(3, 5);
    }

    @Override
    public int getArea() {
        System.out.println("xx" + getArea());
        return area();
    }

    private int area() {
        return 0;
    }

    public int getCircuit() {
        System.out.println("xx" + getCircuit());
        return circuit();
    }
    private int circuit() {

        return 0;
    }

}
