package com.kodilla.collections.lists.homework;

import com.kodilla.collections.homework.Car;
import com.kodilla.collections.homework.Ford;
import com.kodilla.collections.homework.Opel;
import com.kodilla.collections.homework.Toyota;

import java.util.ArrayList;
import java.util.List;
import java.util.function.ToDoubleBiFunction;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Ford> cars = new ArrayList<>();
        cars.add(new Ford(100.0, 50.0, 20.0));
        cars.add(new Ford(100.0, 80.0, 60.0));
        cars.add(new Ford(100.0, 200.0, 50.0));
        for (int n = 0; n < cars.size(); n++)
            System.out.println(cars.get(n));
        for (int n = 0; n < cars.size(); n++) {
            Ford ford = cars.get(n);
            if (ford.getSpeed() >= 100)
                System.out.println(ford + "speed is:" + ford.getSpeed());
        }
        cars.remove(1);
        System.out.println(cars.size());
        for (Car car: cars) {
            System.out.println(car + "speed is:" + car.getSpeed());
        }
        cars.remove(cars);
        System.out.println(cars.size());
        for (Car car: cars) {
            System.out.println(car + "speed is:" + car.getSpeed());
        }
    }
}
