package com.zjnu.week6;

public class Lab6Task12 {
    public static void main(String[] args) {
        int count = 0;
        int number = 2;
        int lineCount = 0;

        while (count < 50) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;
                lineCount++;

                if (lineCount == 10) {
                    System.out.println();
                    lineCount = 0;
                }
            }
            number++;
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
