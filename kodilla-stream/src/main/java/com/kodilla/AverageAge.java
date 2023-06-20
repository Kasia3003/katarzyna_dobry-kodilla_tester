package com.kodilla;

public class AverageAge {
    public static void main(String[] args) {
        double avg = UsersRepository.getUserList()
                .stream()
                .mapToInt(n -> n.getAge(40))
                .average()
                .getAsDouble();
        System.out.println(avg);
    }
}
