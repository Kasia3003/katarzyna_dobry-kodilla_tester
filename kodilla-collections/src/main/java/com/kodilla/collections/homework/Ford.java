package com.kodilla.collections.homework;

public class Ford implements Car {

    private int speed;
    private int increaseSpeed;
    private int decreaseSpeed;
    public Ford(int speed, int increaseSpeed, int decreaseSpeed) {
        this.speed = speed;
        this.increaseSpeed = increaseSpeed;
        this.decreaseSpeed = decreaseSpeed;
    }

    public Ford(double a) {
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
