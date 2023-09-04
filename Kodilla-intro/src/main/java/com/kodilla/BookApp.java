package com.kodilla;

public class BookApp {
    public static void main(String[] args) {
        Book book = new Book();
        Book book1 = Book.of("Stephen King" , "Shining");
        System.out.println("The author of " + book.getTitle() + " is " + book.getAuthor());
    }
}
