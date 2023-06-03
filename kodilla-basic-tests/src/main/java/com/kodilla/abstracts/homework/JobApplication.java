package com.kodilla.abstracts.homework;

public class JobApplication {
    public static void main(String[] args) {
        Job teacher = new Teacher("Teaching", 3000) {
            @Override
            public String getName() {
                return null;
            }

            @Override
            public String getAge() {
                return null;
            }

            @Override
            public String getJob() {
                return null;
            }
        };
        System.out.println("Teacher's responsibility is: " + teacher.getResponsibility() + " for " + teacher.getSalary());
        Person person = new Person("Anna",   22, "teach");
        System.out.println(person.getName() + person.getAge() + "'s responsibility is " + person.getJob());
    }
}
