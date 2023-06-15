package com.kodilla.collections.adv.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> team = new HashMap<>();
        Principal principal1 = new Principal("Jan", "Kowalski");
        Principal principal2 = new Principal("Ewa", "Malinowska");
        Principal principal3 = new Principal("Jacek", "Nowak");
        School principal1Schools = new School(25.00);
        School principal2Schools = new School(30.00);
        School principal3Schools = new School(35.00);
        team.put(principal1, principal1Schools);
        team.put(principal2, principal2Schools);
        team.put(principal3, principal3Schools);
        System.out.println(team.get(principal1));
        System.out.println(team.get(principal2));
        System.out.println(team.get(principal3));
        for (Map.Entry<Principal, School> principalEntry : team.entrySet()) {
            System.out.println(principalEntry.getKey().getFirstname()  +  principalEntry.getKey().getLastname());
        }
    }

    private static void put() {
    }
}
