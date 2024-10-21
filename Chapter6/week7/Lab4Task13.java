package com.zjnu.demo;

import java.util.Scanner;

public class Lab4Task13 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a hex number: ");
            String hexNumber = input.nextLine();

            int decimalValue = hexStringToDecimal(hexNumber);
            System.out.println("The decimal value for hex number " + hexNumber + " is " + decimalValue);
        }

        public static int hexCharToDecimal(char ch) {
            if (ch >= 'A' && ch <= 'F')
                return 10 + ch - 'A';
            else // ch is '0', '1', ..., or '9'
                return ch - '0';
        }

        public static int hexStringToDecimal(String hex) {
            int decimalValue = 0;
            for (int i = 0; i < hex.length(); i++) {
                decimalValue += hexCharToDecimal(hex.charAt(i)) * Math.pow(16, hex.length() - 1 - i);
            }
            return decimalValue;
        }
    }


