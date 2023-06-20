package com.kodilla.optional.homework;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class Application {
    public static void main(String[] args) {
        Student student = new Student("Krzysztof Polak", "Jan Kowalski");
        Student student1 = new Student("Dariusz Niemiec", "Jacek Nowak");
        Student student2 = new Student("Radosław Prus", " ");

        Optional<Student> optionalStudent = Optional.ofNullable(student);
        String teacherName = optionalStudent.orElse(new Student(" ", " ")).getTeachersname();
        System.out.println(teacherName);
    }
}
