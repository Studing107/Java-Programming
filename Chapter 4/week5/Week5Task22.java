package com.zjnu.week5;

import java.util.Scanner;

public class Week5Task22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer between 0 and 15: ");
        int number = scanner.nextInt();

        if (number >= 0 && number <= 15) {
            String hexValue = Integer.toHexString(number).toUpperCase();
            System.out.println("The hex value is " + hexValue);
        } else {
            System.out.println(number + " is an invalid input");
        }

        scanner.close();
    }
}
