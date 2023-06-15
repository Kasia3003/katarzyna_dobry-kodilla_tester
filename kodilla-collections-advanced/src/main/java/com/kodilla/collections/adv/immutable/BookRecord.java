package com.kodilla.collections.adv.immutable;

public record BookRecord(String author, String title, int year) {
    static BookRecord bookRecord = new BookRecord("Test", "Pozycja testowa", 2022);
}
