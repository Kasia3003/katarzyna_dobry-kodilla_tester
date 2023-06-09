package com.kodilla.collections.homework;
import com.kodilla.collections.homework.Ford;
import com.kodilla.collections.homework.Opel;
import com.kodilla.collections.homework.Toyota;
import com.kodilla.collections.homework.Car;

import java.util.Random;

import static com.kodilla.collections.arrays.ShapeApplication.getRandomSize;


public class CarsApplication {
    private static final Random RANDOM = new Random() ;

    public static void main(String[] args) {
        Car[] cars = new Car[15];
        Car drawCar;
        for (int n = 0; n < cars.length; n++)
        cars[n] = drawCar();
        for ( Car car : cars)
            CarUtils.describeCar(car);
    }
    private static Car drawCar() {
        int drawnCarKind = RANDOM.nextInt(15);
        double a = getRandomSize();
        if (drawnCarKind == 0)
            return new Ford(a);
        else if (drawnCarKind == 1)
            return new Opel(a);
        else {
            double b = getRandomSize();
            double c = getRandomSize();
            return new Toyota(a, b, c);
        }
        }
        public static double getRandomSize() {
        return RANDOM.nextDouble() * 100 + 1;
    }
}
