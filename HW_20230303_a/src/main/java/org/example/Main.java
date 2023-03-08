package org.example;


import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        System.out.println(intToRoman(499));

    }

    public static String intToRoman(int num) {

        int[] keys = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] values = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int i = values.length - 1;

        if (num <= 0 ) {
            throw new IllegalArgumentException("You can't enter negative numbers or zero!");
        }
        StringBuilder builder = new StringBuilder();
        while (num > 0) {
            while (keys[i] > num) {
                i--;
            }
            builder.append(values[i]);
            num -= keys[i];
        }
        return builder.toString();

    }
}
