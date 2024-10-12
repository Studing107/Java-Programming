package com.zjnu.week5;

public class Week5Task4 {
    public static void main(String[] args) {
        System.out.println(Math.max(2, 3));
        System.out.println(Math.min(2.5, 4.6));
        System.out.println(Math.max(Math.max(2.5, 4.6), Math.min(3, 5.6)));
        System.out.println(Math.abs(-2));
        System.out.println(Math.abs(-2.1));

        int randomInt0To9 = (int)(Math.random() * 10);
        System.out.println(randomInt0To9);

        int randomInt50To99 = 50 + (int)(Math.random() * 50);
        System.out.println(randomInt50To99);
    }
}
