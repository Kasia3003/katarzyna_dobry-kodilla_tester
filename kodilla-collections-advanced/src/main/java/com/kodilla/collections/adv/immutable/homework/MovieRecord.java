package com.kodilla.collections.adv.immutable.homework;

public record MovieRecord(String title, int duration, String director) {
    static MovieRecord movieRecord = new MovieRecord("Władca Pierścieni: Drużyna Pierścienia", 300, "Peter Jackson");
}
