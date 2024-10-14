package com.zjnu.week6;

import java.util.Random;
import java.util.Scanner;

public class Lab6Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number1, number2, answer, correctCount = 0;

        for (int i = 0; i < 5; i++) {
            number1 = random.nextInt(101);
            number2 = random.nextInt(101);
            if (number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }
            System.out.printf("What is %d - %d? ", number1, number2);
            answer = scanner.nextInt();

            if (number1 - number2 == answer) {
                System.out.println("You are correct!");
                correctCount++;
            } else {
                System.out.println("Your answer is wrong.");
            }
        }

        System.out.printf("You got %d out of 5 correct.\n", correctCount);
        scanner.close();
    }
}
