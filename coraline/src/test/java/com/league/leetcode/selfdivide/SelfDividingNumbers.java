package com.league.leetcode.selfdivide;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by coraline on 2019/3/22.
 */
public class SelfDividingNumbers {

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ret = new ArrayList<>();
        for (int x = left; x <= right; x++) {
            if (x < 10) {
                System.out.println(x);
                ret.add(x);
                continue;
            }
            if (isSelfDividing(x)) {
                System.out.println(x);
                ret.add(x);
            }
        }

        return ret;
    }

    private static boolean isSelfDividing(int x) {
        int mod = 10;
        int n = x;
        while (x != 0) {
            int temp = x % mod;
            if (temp == 0) {
                return false;
            }
            if (n % temp != 0) {
                return false;
            }
            x = x / 10;
        }
        return true;
    }

    public static void main(String[] args) {
        int left = 1;
        int right = 22;
        List<Integer> list = selfDividingNumbers(left, right);
    }
}
