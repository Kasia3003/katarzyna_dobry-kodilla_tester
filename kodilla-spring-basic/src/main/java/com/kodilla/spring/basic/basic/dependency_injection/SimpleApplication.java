package com.kodilla.spring.basic.basic.dependency_injection;

public class SimpleApplication {
    private MessageService messageService = new MessageService();

    public void processMessage(String message, String receiver) {
        if (checkReceiver(receiver)) {
            this.messageService.send(message, receiver);
        }
    }
    private boolean checkReceiver(String receiver) {
        return receiver != null && !receiver.isEmpty();
    }
}
