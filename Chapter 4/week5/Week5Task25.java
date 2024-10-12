package com.zjnu.week5;

import java.util.Arrays;
import java.util.Scanner;

public class Week5Task25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] cities = new String[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter city " + (i + 1) + ": ");
            cities[i] = scanner.nextLine();
        }

        Arrays.sort(cities);

        System.out.println("The three cities in alphabetical order are " + String.join(" ", cities));

        scanner.close();
    }
}
