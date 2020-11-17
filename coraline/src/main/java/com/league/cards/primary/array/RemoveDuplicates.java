package com.league.cards.primary.array;

/**
 * Created by coraline on 2020/3/27.
 */
public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }


        int len = 1;
        int num = nums[0];
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if(num != nums[i]){
                len++;
                num = nums[i];
                nums[index + 1] = nums[i];
                index++;
            }

        }

        return len;

    }

    public static void main(String[] args) {

        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int len = removeDuplicates(nums);
        System.out.println("len: " + len);
        for (int i = 0; i < len; i++) {
            System.out.println(nums[i]);
        }
    }


}
