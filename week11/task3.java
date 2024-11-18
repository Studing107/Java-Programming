package com.zjnu.demo;

public class task3 {
    public static void main(String[] args) {
        int [][] arr=new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j=0;j<arr[0].length;j++){
                arr[i][j]=(int)(Math.random()*20);

            }

        }
        System.out.println(arr[0][0]);
    }
}
