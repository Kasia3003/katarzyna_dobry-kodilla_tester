package com;

public class Grades {
    private int[] grades;
    private int size;

    private Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 0) {
            return;
        }
        if (this.size == 1) {
            return;
        }
        if (this.size == 2) {
            return;
        }
        if (this.size == 3) {
            return;
        }
        if (this.size == 11) {
            return;
        }

        this.grades[this.size] = value;
        this.size++;

    }
}


