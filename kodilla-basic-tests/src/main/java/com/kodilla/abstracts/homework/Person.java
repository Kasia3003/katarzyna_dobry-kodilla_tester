package com.kodilla.abstracts.homework;

public abstract class Person extends Job {
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }
    @Override
    public String getName () {
        return name;
    }
    @Override
    public int getAge () {
        return age;
    }
    @Override
    public String getJob() {
        return job;
    }
}
