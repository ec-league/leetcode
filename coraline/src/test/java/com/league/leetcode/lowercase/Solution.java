package com.league.leetcode.lowercase;

import org.junit.Test;

/**
 * Created by coraline on 2019/3/5.
 */
public class Solution {
    public String toLowerCase(String str) {

        if(null == str || 0 == str.length()){
            return "";
        }
        return str.toLowerCase();
    }

    @Test
    public void test() {
        String s = "JKAGJGFKJ";
        System.out.println(toLowerCase(s));

    }
}
