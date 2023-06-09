package com.kodilla.collections.homework;

public class Opel implements Car {

    private int speed;
    private int increaseSpeed;
    private int decreaseSpeed;
    public Opel(int speed, int increaseSpeed, int decreaseSpeed) {
        this.speed = speed;
        this.increaseSpeed = increaseSpeed;
        this.decreaseSpeed = decreaseSpeed;
    }

    public Opel(double a) {
    }

    public double getSpeed() {
        return speed;
    }
    public double getIncreaseSpeed() {
        return speed + increaseSpeed;
    }
    public double getDecreaseSpeed() {
        return speed - decreaseSpeed;
    }
}
