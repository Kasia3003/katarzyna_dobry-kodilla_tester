package com.kodilla.abstracts.homework;

public class Teacher extends Job {
    private String task;
    private int money;
    public Teacher(String task, int money){
        this.task = task;
        this.money = money;
    }
    @Override
    public String getResponsibility() {
        return task;
    }
    @Override
    public double getSalary() {
        return money;
    }
}
