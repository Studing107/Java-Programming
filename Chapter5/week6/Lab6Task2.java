package com.zjnu.week6;

import java.util.Scanner;

public class Lab6Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        int answer;
        int attempts = 0;

        do {
            System.out.print("What is " + number1 + " + " + number2 + "? ");
            answer = scanner.nextInt();
            attempts++;
            if (answer != number1 + number2) {
                System.out.println("Wrong answer. Try again.");
            }
        } while (answer != number1 + number2);

        System.out.println("You got it!");
        System.out.println("Attempts: " + attempts);
    }
}
