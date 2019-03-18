package com.league.leetcode.deletion;

/**
 * Created by coraline on 2019/3/13.
 */
public class DeletionColumns {

    public static int minDeletionSize(String[] A) {
        int count = 0;
        if (null == A || 0 == A.length) {
            return count;

        }
        for (int i = 0; i < A[0].length(); i++) {
            for (int j = 0; j < A.length -1; j++) {
                if (A[j].charAt(i) > A[j + 1].charAt(i)) {
                    count++;
                    break;
                }

            }

        }

        return count;

    }

    public static void main(String[] args) {
        String[] a = {"rrjk","furt","guzm"};
        int size = minDeletionSize(a);
        System.out.println(size);

         a = new String[]{"a","b"};
         size = minDeletionSize(a);
        System.out.println(size);

         a = new String[]{"zyx", "wvu", "tsr"};
         size = minDeletionSize(a);
        System.out.println(size);

        a = new String[]{"rrjk","furt","guzm"};
        size = minDeletionSize(a);
        System.out.println(size);

    }
}
