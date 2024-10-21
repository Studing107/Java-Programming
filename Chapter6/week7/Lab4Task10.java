package com.zjnu.demo;

import java.util.Scanner;

public class Lab4Task10 {
    public static char getRandomCharacter(char ch1, char ch2) {
        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    // Generate a random Lowercase letter
    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }

    // Generate a random lowercase letter
    public static char getRandomUpperCaseLetter(){
        return getRandomCharacter('A', 'Z');
    }
}