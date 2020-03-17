package com.league.contest.contest127;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by coraline on 2020/1/19.
 */
public class WordsVertically {

    public static List<String> printVertically(String s) {
        List<String> ret = new ArrayList();
        String[] sArr = s.split(" ");
        int arrMaxLen = 0;
        for (int i = 0; i < sArr.length; i++) {
            arrMaxLen = arrMaxLen > sArr[i].length() ? arrMaxLen : sArr[i].length();
        }


        for (int i = 0; i < arrMaxLen; i++) {
            String x = "";
            for (int j = 0; j < sArr.length; j++) {
                if (i >= sArr[j].length() && j < sArr.length) {
                    x += " ";
                } else if (i < sArr[j].length()) {
                    x += sArr[j].charAt(i);
                }
            }
            for (int k = x.length() - 1; k >= 0; k--) {
                if (x.charAt(k) == ' ') {
                    x = x.substring(0, k);
                } else if (x.charAt(k) != ' ') {
                    break;
                }
            }

            ret.add(x);
        }


        return ret;

    }

    public static void main(String[] args) {
        String s = "TO BE OR NOT TO BE";
        List<String> ret = printVertically(s);
        System.out.println(ret);

    }
}
