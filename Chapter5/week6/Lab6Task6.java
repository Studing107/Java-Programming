package com.zjnu.week6;

import java.util.Scanner;

public class Lab6Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, data;

        do {
            System.out.print("Enter an integer (the input ends if it is 0): ");
            data = scanner.nextInt();
            sum += data;
        } while (data != 0);

        System.out.println("The sum is " + sum);

        scanner.close();
    }
}
