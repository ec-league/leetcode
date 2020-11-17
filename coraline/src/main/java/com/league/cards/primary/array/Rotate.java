package com.league.cards.primary.array;

/**
 * Created by coraline on 2020/3/27.
 */
public class Rotate {

    public static void rotate(int[] nums, int k) {

        if (0 == k) {
            return;
        }

        int temp = nums[0];
        k--;
        int index = nums.length - 1;
        for (; index >= k - 1 ; index-- ) {
            temp = nums[index];
            nums[index] = nums[k];
            nums[k] = temp;
            k--;
        }

    }

    public static void main(String[] args) {
        int[] arr = {-1, -100, 3, 99};

        int k = 3;

        rotate(arr, k);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
