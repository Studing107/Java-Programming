package com.zjnu.demo;

public class task1 {
    public static void main(String[] args) {
        int [][] arr1={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.err.println("length of arr1 "+arr1.length);
        System.err.println("length of arr1's column 1 "+arr1[0].length);
        int [][] arr2 =new int[3][];
        arr2[0]=new int[]{1,2,3};
        System.err.println("the length of arr2 "+arr2.length);
        System.err.println("length of arr2's column 1 "+arr2[0].length);
        }
    }

