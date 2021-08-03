package ru.geekbrains.homework1;

import static java.lang.Math.sqrt;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        // Задание со звездочкой
        System.out.println("\n" + getHypotenuseLength(2, 3));
    }

    public static double getHypotenuseLength(double a, double b) {
        double c = sqrt(a * a + b * b);
        return c;
    }

    private static void printThreeWords() {
        System.out.printf("Orange\nBanana\nApple\n");
    }

    private static void checkSumSign() {
        int a = 1;
        int b = 2;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    private static void printColor() {
        int value = 200;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 & value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    private static void compareNumbers() {
        int a = 1;
        int b = 2;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}

