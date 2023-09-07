package com.kodilla;

import java.util.Scanner;

public class Colors {

    public static String getColorSelection() {
    Scanner scanner = new Scanner(System.in);
    while (true) {
        System.out.println(("Select color (B- blue, R- red, G- green, Y- yellow):"));

        final String s = ("Select color (B- blue, R- red, G- green, Y- yellow):");
        String calc = scanner.nextLine().trim().toUpperCase();


        switch (calc) {
            case "B":
                return "blue";
            case "R":
                return "red";
            case "G":
                return "green";
            case "Y":
                return "yellow";
            default:
        }

        System.out.println("Please try again");
    }
}
    public static int getLetter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter letter");
        int let = scanner.nextInt();
        return let;
    }
}
