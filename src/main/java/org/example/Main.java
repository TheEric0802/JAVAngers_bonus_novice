package org.example;

public class Main {
    public static void main(String[] args) {
        String name = "Eric";

        for (int i = 0; i < 5; i++) {
            System.out.println(name);
        }

        System.out.println(isGreaterThanZero(10));

        System.out.println(square(5));
    }

    public static boolean isGreaterThanZero(int a) {
        return a > 0;
    }

    public static int square(int a) {
        return a * a;
    }
}