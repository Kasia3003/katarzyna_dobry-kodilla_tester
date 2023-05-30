package com.kodilla;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Katarzyna");
        System.out.println("30");
        System.out.println("D");
    }

    public static class DebugExample {
        public static void main(String[] args) {
        int firstNumber = 11;
        int secondNumber = 22;

        System.out.println(firstNumber);
        System.out.println(secondNumber);

        sumAndDisplay(firstNumber, secondNumber);
    }

        private static void sumAndDisplay(int a, int b) {
            int result = a + b;

            System.out.println(result);
        }
    }

    public static class Notebook {
    }
}
