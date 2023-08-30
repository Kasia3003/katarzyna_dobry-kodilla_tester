package com.kodilla.spring.basic.basic.dependency_injection;

public class MessageService {
    public void send(String message, String receiver) {
        System.out.println("Sending message [" + message + "] to: " + receiver);
    }
}
