package com.league.leetcode.base7;

/**
 * Created by coraline on 2020/1/16.
 */
public class Base7 {

    public static String convertToBase7(int num) {

        StringBuilder result = new StringBuilder();

        int upperLimit = 1;
        int originalNum = num;
        if (num == 0) {
            return "0";
        }
        if (num < 0) {
            originalNum = Math.abs(num);
            result.append("-");
        }

        while (originalNum / upperLimit >= 1) {
            upperLimit *= 7;
        }
        for (int i = 0; upperLimit >= 1; i++) {
            int number = originalNum / upperLimit;
            if (i != 0) {
                result.append(number);
            }
            originalNum = originalNum % upperLimit;
            upperLimit /= 7;
        }
        return result.toString();
    }

    public static void main(String[] args) {
        int input = 100;
        String output = convertToBase7(input);
        System.out.println(output);
    }
}
