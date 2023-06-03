package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Shape square = new Square(5);
        System.out.println("Pole kwadratu o boku 5 wynosi: " + square.getSurface());
        System.out.println("Obwód kwadratu o boku 5 wynosi: " + square.getCircumference());
        Shape circle = new Circle (3);
        System.out.println("Pole koła o promieniu 3 wynosi: " + circle.getSurface());
        System.out.println("Obwód koła o promieniu 3 wynosi: " + circle.getCircumference());
    }
}
