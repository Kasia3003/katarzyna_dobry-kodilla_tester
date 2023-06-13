package com.kodilla.collections.homework;

public class Opel implements Car {

    private double speed;
    private double increaseSpeed;
    private double decreaseSpeed;
    public Opel(double speed, double increaseSpeed, double decreaseSpeed) {
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

    @Override
    public String toString() {
        return "Opel{" +
                "speed=" + speed +
                ", increaseSpeed=" + increaseSpeed +
                ", decreaseSpeed=" + decreaseSpeed +
                '}';
    }
}
