package com.kodilla;

public class GradesMain {
    public static void main(String[] args) {
        Grades grades = new Grades();
        grades.add(1);
        for (int i = 0; i < Grades.length; i++) ;
    }

    private final int i = 0;

    {
        double[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double total = 0;
        for (int i = 0; i < Grades.length; i++);
        {
            total = total + arr[i];
        }
        double average = total / arr.length;
        System.out.println("Average is: " + arr);
    }
}
