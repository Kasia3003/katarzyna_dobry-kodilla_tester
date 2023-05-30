package com.kodilla;

public class Grades {
    public static int lenght;
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
        this.size = 1;
    }

    public void add(int value) {

        this.grades[this.size] = value;
        this.size++;
    }
    }


