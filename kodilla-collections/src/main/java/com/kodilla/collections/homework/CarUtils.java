package com.kodilla.collections.homework;

import com.kodilla.collections.homework.Ford;
import com.kodilla.collections.homework.Opel;
import com.kodilla.collections.homework.Toyota;
import com.kodilla.collections.homework.Car;

import java.util.Random;

public class CarUtils {
    public static void describeCar(Car car) {
        System.out.println("-----------------------------");
        System.out.println("Car kind" + getCarName(car));
        System.out.println("Car speed is: " + car.getSpeed());
        System.out.println("Car increased speed is: " + car.getIncreaseSpeed());
        System.out.println("Car decreased speed is: " + car.getDecreaseSpeed());
    }

    private static String getCarName(Car car) {
        if (car instanceof Ford)
            return "Ford";
        else if (car instanceof Opel)
            return "Opel";
        else if (car instanceof Toyota)
            return "Toyota";
        else
            return "Unknown cars name";
    }
    public static Car drawCar() {
        Random random = new Random();
        int drawnCarKind = random.nextInt(3);
        double a = random.nextDouble() * 100 + 1;
        if (drawnCarKind == 0)
            return new Ford(a);
        else if (drawnCarKind == 1)
            return new Opel(a);
        else {
            double b = random.nextDouble() * 100 + 1;
            double c = random.nextDouble() * 100 + 1;
            return new Toyota(a, b, c);
        }
    }
    private static double getRandomSize(Random random) {
        return random.nextDouble() * 100 + 1;
    }
}
