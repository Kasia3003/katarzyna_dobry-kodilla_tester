package com.kodilla.stream.homework;

import com.kodilla.User;
import com.kodilla.UsersRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



public class ForumStats {
    public static void main(String[] args) {
        double avg = UsersRepository.getUserList()
                .stream()
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
        System.out.println(avg);
    }
}
