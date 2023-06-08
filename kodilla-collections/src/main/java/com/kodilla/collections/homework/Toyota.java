package com.kodilla.collections.homework;

public class Toyota implements Car {

    private int speed;
    private int increaseSpeed;
    private int decreaseSpeed;
    public Toyota(int speed, int increaseSpeed, int decreaseSpeed) {
        this.speed = speed;
        this.increaseSpeed = increaseSpeed;
        this.decreaseSpeed = decreaseSpeed;
    }
    public int getSpeed() {
        return speed;
    }
    public int getIncreaseSpeed() {
        return speed + increaseSpeed;
    }
    public int getDecreaseSpeed() {
        return speed - decreaseSpeed;
    }
}
