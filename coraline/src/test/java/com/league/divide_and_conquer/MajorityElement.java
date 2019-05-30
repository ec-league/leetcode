package com.league.divide_and_conquer;

/**
 * Created by coraline on 2019/5/30.
 */
public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int majorityLen = nums.length / 2;
        int maxCode = Integer.MIN_VALUE;

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count = 0;
            for (int j = i ; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    count++;
                }
                if (count > majorityLen) {
                    return nums[i];
                }
            }
        }

        return maxCode;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        int majorityElement = majorityElement(nums);
        System.out.println(majorityElement);
    }
}
