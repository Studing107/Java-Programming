package com.zjnu.demo;

public class task6 {
      public static void main(String[] args) {
          int[][] arr = new int[3][3];
          for (int i = 0; i < arr.length; i++) {
              for (int j = 0; j < arr[0].length; j++) {
                  arr[i][j] = (int) (Math.random() * 20);

              }
          }
          int max=0,sum=0,index=0;
          for (int i = 0; i < arr.length; i++){
              for (int j = 0; j < arr[i].length; j++) {
                  sum+=arr[i][j];
              }
              if(sum>max) {
                  max = sum;
                  index=i;
              }
              sum=0;
          }

          System.out.println("the index of the row with the largest sum is: "+index);
          System.out.println("the row is:" + index);
      }
}
