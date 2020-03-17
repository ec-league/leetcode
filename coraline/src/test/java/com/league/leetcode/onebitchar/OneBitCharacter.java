package com.league.leetcode.onebitchar;

/**
 * Created by coraline on 2020/1/15.
 */
public class OneBitCharacter {

    public static boolean isOneBitCharacter(int[] bits) {

        if (1 == bits.length) {
            if (0 == bits[0]) {
                return true;
            } else {
                return false;
            }
        }

        int i = 0;
        for (; i <= bits.length - 2; ) {
            if (0 == bits[i]) {
                i++;
            } else if (1 == bits[i] && i == bits.length - 2) {
                break;
            } else if (1 == bits[i] && i < bits.length - 2) {
                i += 2;
            }
        }

        if (bits.length - 1 == i) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {

        int[] bits1 = {1, 0, 0};
        boolean isOneBit = isOneBitCharacter(bits1);
        System.out.println(isOneBit);

        int[] bits2 = {1, 1, 1, 0};
        isOneBit = isOneBitCharacter(bits2);
        System.out.println(isOneBit);

        int[] bits3 = {0, 0};
        isOneBit = isOneBitCharacter(bits3);
        System.out.println(isOneBit);
    }

}