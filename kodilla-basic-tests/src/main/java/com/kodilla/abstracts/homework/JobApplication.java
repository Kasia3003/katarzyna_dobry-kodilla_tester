package com.kodilla.abstracts.homework;

public class JobApplication {
    public static void main(String[] args) {
        Job teacher = new Teacher("Teaching", 3000);
        System.out.println("Teacher's responsibility is: " + teacher.getResponsibility() + " for " + teacher.getSalary());
        Job person = new Person("Anna", 22,"teach");
        System.out.println(person.getName() + person.getAge() + "'s responsibility is " + person.getJob());
    }
}
