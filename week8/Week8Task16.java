package com.zjnu.week8;

public class Week8Task16 {
      public static void main(String[] args) {
          int x = 1; // x代表一个int值
          int[] y = new int[10]; // y表示一个int值的数组
          System.out.println("Value of x before: " + x);
          System.out.println("Value of y[0] before: " + y[0]);

          // 调用测试方法
          test(x, y);
          System.out.println("Value of x after: " + x);
          System.out.println("Value of y[0] after: " + y[0]);
      }


         public static void test(int number, int[] numbers) {
                 number = 2; // 给number赋一个新的值
                 numbers[0] = 5; // 给array[0]赋一个新的值
             }
}


