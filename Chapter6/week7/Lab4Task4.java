package com.zjnu.demo;

public class Lab4Task4 {
    public static char getGrade(double a) {
        if (a >= 90) {
            return 'A';
        } else if (a >= 80) {
            return 'B';
        } else if (a >= 70) {
            return 'C';
        } else if (a >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static void main(String[] args) {
        System.out.println("The grade is " + getGrade(90));

    }
}
