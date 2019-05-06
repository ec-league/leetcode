package com.league.leetcode.sum3;

import java.util.*;

/**
 * Created by coraline on 2019/4/25.
 */
public class Sum {

    public static List<List<Integer>> threeSum(int[] nums) {
        if (null == nums || nums.length < 3) {
            return new ArrayList<>();
        }
        //sort the array
        Arrays.sort(nums);
        //double points
        List<List<Integer>> ret = getNumLists(nums);
        return ret;
    }

    private static List<List<Integer>> getNumLists(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        Map<Integer, Integer> firstNumOfLoop = new HashMap<>();
        Map<String, Integer> combinationMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (null != firstNumOfLoop.get(nums[i])) {
                continue;
            }
            List<List<Integer>> numsList = getNumsList(nums, i, combinationMap);
            if (null == numsList || 0 == numsList.size()) {
                continue;
            }
            firstNumOfLoop.put(nums[i], 1);
            ret.addAll(numsList);
        }
        return ret;
    }

    private static List<List<Integer>> getNumsList(int[] nums, int i, Map<String, Integer> combinationMap) {
        int low = 0;
        int high = nums.length - 1;
        List<List<Integer>> loopList = new ArrayList<>();
        List<Integer> ret;
        while (low < high) {
            int count = nums[low] + nums[high] + nums[i];
            if (count > 0 || i == high) {
                high--;
            } else if (count < 0 || i == low) {
                low++;
            } else {
                ret = new ArrayList<>();
                if (nums[i] < nums[low]) {
                    ret.add(nums[i]);
                    ret.add(nums[low]);
                    ret.add(nums[high]);
                } else if (nums[i] > nums[high]) {
                    ret.add(nums[low]);
                    ret.add(nums[high]);
                    ret.add(nums[i]);
                } else {
                    ret.add(nums[low]);
                    ret.add(nums[i]);
                    ret.add(nums[high]);
                }
                String key = ret.get(0).toString() + ret.get(1).toString();
                if(null == combinationMap.get(key)){
                    loopList.add(ret);
                    combinationMap.put(key, 1);
                }
                low++;
                high--;
            }
        }
        return loopList;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> list = threeSum(nums);
        System.out.println(list.toString());
//        int[] nums = {-1, 0, 1, 2, -1, -4};
//        int[] sortedNums = sort(nums);
//        for (int i = 0; i < sortedNums.length; i++) {
//            System.out.println(sortedNums[i]);
//        }

    }
}
