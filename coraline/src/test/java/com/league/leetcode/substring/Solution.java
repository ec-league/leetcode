package com.league.leetcode.substring;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by coraline on 2019/3/4.
 */
public class Solution {

    public int lengthOfLongestSubstring(String s) {
        int maxLength = 1;
        if (s == null || s.length() == 0) {
            return 0;
        }
        char[] charArr = s.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            for (int j = i + 1; j < charArr.length; j++) {
                String comparedWindow = s.substring(i, j);
                if (!comparedWindow.contains(String.valueOf(charArr[j]))) {
                    int tempMaxLen = j - i + 1;
                    maxLength = tempMaxLen > maxLength ? tempMaxLen : maxLength;
                } else {
                    break;
                }
            }
        }
        return maxLength;
    }

    @Test
    public void test() {
        Map map = new HashMap<String,String>();
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));

    }
}
