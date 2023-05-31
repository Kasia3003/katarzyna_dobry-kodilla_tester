package com.kodilla;

public class Grades {
    public static int length;
    private int[] grades;
    private int size;
    int i = 0;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {

        this.grades[this.size] = value;
        this.size++;
        int numberOfElements = grades.length;
    }
}


