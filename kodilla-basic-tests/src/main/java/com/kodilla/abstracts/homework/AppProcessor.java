package com.kodilla.abstracts.homework;

import java.awt.geom.Area;

public class AppProcessor {
    public static void main(String[] args) {
        Shape circle = new Circle();
        AppProcessor processor = new AppProcessor();
        processor.process(circle);
    }

    private void process(Shape shape) {
        System.out.println("Circle area is 3 square cm");
        System.out.println("Circle circuit is 5 cm");
    }
}
