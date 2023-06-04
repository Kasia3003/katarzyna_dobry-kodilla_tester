package com.kodilla;

public class ApplicationMain {
    public static void main(String[] args) {
        Application application = new Application("Adam", 30, 160);
        System.out.println(application.name);
        System.out.println(application.age);
        System.out.println(application.height);
        System.out.println(application.age + application.height);
        application.checkAge();
        application.checkHeight();
    }
}
