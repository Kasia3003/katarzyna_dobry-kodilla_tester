package com.kodilla.optional;

import com.kodilla.User;

import javax.swing.text.html.Option;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        User user = new User("user1", 30, 100, "Test");
        Optional<User> optionalUser = Optional.ofNullable(user);
        optionalUser.ifPresent(user1 -> System.out.println(user.getUsername()));
    }
}
