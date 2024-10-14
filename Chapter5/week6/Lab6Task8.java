package com.zjnu.week6;

public class Lab6Task8 {
    public static void main(String[] args) {
        System.out.println("\t"+'\t'+1+'\t'+2+'\t'+3+'\t'+4+'\t'+5+'\t'+6+'\t'+7+'\t'+8+'\t'+9);
        for(int i=1;i<10;i++)
        {
            System.out.print(i+"\t"+"|"+"\t");
            for (int j = 1; j <10 ; j++) {
                System.out.print(i*j+"\t");

            }
            System.out.print("\n");
        }
    }
}
