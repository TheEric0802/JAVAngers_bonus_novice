package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name = "Eric";

        for (int i = 0; i < 5; i++) {
            System.out.println(name);
        }

        System.out.println(isGreaterThanZero(10));

        System.out.println(square(5));

        Scanner input = new Scanner(System.in);
        System.out.println("Gib deinen Namen ein");
        String username = input.nextLine();
        System.out.println("Hallo " + username);
    }

    public static boolean isGreaterThanZero(int a) {
        return a > 0;
    }

    public static int square(int a) {
        return a * a;
    }
}