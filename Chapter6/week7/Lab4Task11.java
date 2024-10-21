package com.zjnu.demo;

import java.util.Random;

public class Lab4Task11 {
    public static void main(String[] args) {
        final int NUMBER_OF_CHARS = 175;
        final int CHAR_PER_LINE = 25;

// Print random characters between a and z, 25 chars per line
        for (int i = 0; i < NUMBER_OF_CHARS; i++) {
            char ch =com.zjnu.demo.Lab4Task10.getRandomLowerCaseLetter();
            if ((i + 1) % CHAR_PER_LINE == 0)
                System.out.println(ch);
            else
                System.out.print(ch);
        }
    }
}
