package com.league.cards.primary.string;

/**
 * Created by coraline on 2020/4/13.
 */
public class ReverseString {

    public static void reverseString(char[] s) {

        int len = s.length;
        for (int i = 0; i < s.length / 2; i++) {
            char temp  = s[i];
            int index = len - 1 - i;
            s[i] = s[index];
            s[index] = temp;
        }
    }

    public static void main(String[] args) {
        char[] arr = {'h', 'e', 'l', 'l', 'o'};
        reverseString(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
