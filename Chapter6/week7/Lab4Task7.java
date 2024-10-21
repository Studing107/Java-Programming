package com.zjnu.demo;

public class Lab4Task7 {
    public class TestPassByValue {
        public static void main(String[] args) {
            Integer num1 = 1;
            Integer num2 = 2;

            System.out.println("Before invoking the swap method, num1 is " + num1 + " and num2 is " + num2);

            swap(num1, num2);

            System.out.println("After invoking the swap method, num1 is " + num1 + " and num2 is " + num2);
        }

        public static void swap(Integer a, Integer b) {
            Integer temp = a;
            a = b;
            b = temp;
        }
    }
}



