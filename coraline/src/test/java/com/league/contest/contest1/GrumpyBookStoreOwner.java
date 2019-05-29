package com.league.contest.contest1;

/**
 * Created by coraline on 2019/5/29.
 */
public class GrumpyBookStoreOwner {
    public static int maxSatisfied(int[] customers, int[] grumpy, int X) {
        int maxSatisfiedByX = 0;
        int originalSatisfied = 0;
        for (int i = 0; i < customers.length; i++) {
            if (grumpy[i] == 0) {
                originalSatisfied += customers[i];
            }
            if (i + X <= customers.length) {
                int up = 0;
                for (int j = i; j < i + X; j++) {
                    if (grumpy[j] == 1) {
                        up += customers[j];
                    }
                }
                maxSatisfiedByX = up > maxSatisfiedByX ? up : maxSatisfiedByX;
            }
        }
        return originalSatisfied + maxSatisfiedByX;
    }

    public static void main(String[] args) {
        int[] customers = {10, 1, 7};
        int[] grumpy = {0, 0, 0};
        int X = 2;
        int max = maxSatisfied(customers, grumpy, X);
        System.out.println(max);
    }
}
