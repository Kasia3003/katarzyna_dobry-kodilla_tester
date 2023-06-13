package com.kodilla.collections.homework;

public class Ford implements Car {

    private double speed;
    private double increaseSpeed;
    private double decreaseSpeed;
    public Ford(double speed, double increaseSpeed, double decreaseSpeed) {
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

    @Override
    public String toString() {
        return "Ford{" +
                "speed=" + speed +
                ", increaseSpeed=" + increaseSpeed +
                ", decreaseSpeed=" + decreaseSpeed +
                '}';
    }
}
