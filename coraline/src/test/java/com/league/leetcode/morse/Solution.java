package com.league.leetcode.morse;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by coraline on 2019/3/5.
 */
public class Solution {

    public int uniqueMorseRepresentations(String[] words) {
        String[] morseArr = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        Set set = new HashSet();
        for (int j = 0; j < words.length; j++) {
            char[] charArray = words[j].toCharArray();
            StringBuilder morseSb = new StringBuilder();

            for(int k = 0; k < charArray.length; k++){
                morseSb.append(morseArr[charArray[k] - 'a']) ;
            }
            set.add(morseSb.toString());
        }

        System.out.println(set.size());
        return set.size();
    }


    @Test
    public void test() {

        String[] words = {"gin", "zen", "gig", "msg"};

        uniqueMorseRepresentations(words);
    }

}
