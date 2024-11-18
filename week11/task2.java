package com.zjnu.demo;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
    int [][] arr = new int[3][3];
    Scanner sc =new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++){
                arr[i][j]=sc.nextInt();
            }

        }
        sc.close();
    }
}
