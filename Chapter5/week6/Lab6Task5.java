package com.zjnu.week6;

import java.util.Scanner;

public class Lab6Task5 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int sum = 0, number;

            System.out.println("Enter integers (0 to end): ");
            number = scanner.nextInt();

            while (number != 0) {
                sum += number;
                number = scanner.nextInt();
            }

            System.out.println("The sum is: " + sum);

            scanner.close();
        }
}
