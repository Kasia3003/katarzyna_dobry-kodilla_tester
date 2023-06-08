package com.kodilla.collections.homework;
import com.kodilla.collections.homework.Toyota;
import com.kodilla.collections.homework.Ford;
import com.kodilla.collections.homework.Opel;
public class CarRace {
    public static void main(String[] args) {
        Ford ford = new Ford(100, 50, 20);
        showFordSpeed(ford);
        Opel opel = new Opel(100,70, 30);
        showOpelSpeed(opel);
        Toyota toyota = new Toyota(100, 100, 40);
        showToyotaSpeed(toyota);
    }
    private static void showFordSpeed(Ford ford) {
        System.out.println("Fords speed is: " + ford.getSpeed() + "km/h");
        System.out.println("Fords increased speed is: " + ford.getIncreaseSpeed() + "km/h");
        System.out.println("Fords decreased speed is: " + ford.getDecreaseSpeed() + "km/h");
    }
    private static void showOpelSpeed(Opel opel) {
        System.out.println("Opel speed is: " + opel.getSpeed() + "km/h");
        System.out.println("Opel increased speed is: " + opel.getIncreaseSpeed() + "km/h");
        System.out.println("Opel decreased speed is: " + opel.getDecreaseSpeed() + "km/h");
    }
    private static void showToyotaSpeed(Toyota toyota) {
        System.out.println("Toyota speed is: " + toyota.getSpeed() + "km/h");
        System.out.println("Toyota increased speed is: " + toyota.getIncreaseSpeed() + "km/h");
        System.out.println("Toyota decreased speed is: " + toyota.getDecreaseSpeed() + "km/h");
    }
}
