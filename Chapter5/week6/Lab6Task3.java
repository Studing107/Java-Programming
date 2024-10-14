package com.zjnu.week6;

import java.util.Random;
import java.util.Scanner;

public class Lab6Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int secretNumber = random.nextInt(101);
        int guess;
        boolean hasGuessedCorrectly = false;

        System.out.println("I have guessed a number between 0 and 100. Try to guess it!");

        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess < secretNumber) {
                System.out.println("Too low. Try again.");
            } else if (guess > secretNumber) {
                System.out.println("Too high. Try again.");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You've guessed the correct number!");
            }
        }

        scanner.close();
    }
}
