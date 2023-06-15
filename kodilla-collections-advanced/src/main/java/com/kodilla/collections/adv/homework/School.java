package com.kodilla.collections.adv.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class School {
    private List<Double> schools = new ArrayList<>();
    public School(double schools) {
        this.schools = Collections.singletonList(schools);
    }
    public double getAverage() {
        double sum = 0.0;
        for (double school : schools)
        sum += school;
        return sum / schools.size();
    }
    @Override
    public String toString() {
        return "Schools " + schools.toString();
    }
}