package com.league.cards.primary.array;

/**
 * Created by coraline on 2020/4/10.
 */
public class PlusOne {

    public static int[] plusOne(int[] digits) {


        for (int i = digits.length - 1; i >= 0; i--) {
            if (9 != digits[i]) {
                digits[i] += 1;
                break;
            } else {
                digits[i] = 0;
            }

        }

        return digits;

    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3};
        int[] arr3 = plusOne(arr1);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr3[i]);
        }

        System.out.println("##############");
        int[] arr2 = {4, 3, 2, 1};
        int[] arr4 = plusOne(arr2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr4[i]);
        }

    }
}
