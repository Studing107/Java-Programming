package com.zjnu.demo;

public class task7 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                int i1 = (int) (Math.random() * matrix.length);
                int j1 = (int) (Math.random() * matrix[row].length);

                // Swap matrix[row][column] with matrix[i1][j1]

                int temp = matrix[row][column];
                matrix[row][column] = matrix[i1][j1];
                matrix[i1][j1] = temp;
            }
        }
            System.out.println("Array after shuffling:");
            for (int row = 0; row < matrix.length; row++) {
                for (int column = 0; column < matrix[row].length; column++) {
                    System.out.print(matrix[row][column] + " ");
                }
                System.out.println();
            }
        }
    }

