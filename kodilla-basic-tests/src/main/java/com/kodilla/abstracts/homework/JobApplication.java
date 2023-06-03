package com.kodilla.abstracts.homework;

public class JobApplication {
    public static void main(String[] args) {
        int string;
        Job teacher = new Teacher("Teaching", 3000);
        System.out.println("Teacher's responsibility is :" + teacher.getResponsibility() + "for" + teacher.getSalary());
    }
}
