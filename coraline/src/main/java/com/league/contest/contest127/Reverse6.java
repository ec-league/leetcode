package com.league.contest.contest127;

/**
 * Created by coraline on 2020/1/19.
 */
public class Reverse6 {

    public static int maximum69Number(int num) {
        String numStr = String.valueOf(num);
        int numMax = num;
        char[] numArr = numStr.toCharArray();
        boolean flag = false;
        for (int i = 0; i < numArr.length; i++) {
            if('9' == numArr[i]){
                continue;
            }
            if('6' == numArr[i] && flag == false){
                numArr[i] = '9';
                flag = true;
            }
        }
        numMax = Integer.valueOf(String.valueOf(numArr));
        return numMax;

    }

    public static void main(String[] args) {
        int num = 99669;
        int numMax = maximum69Number(num);
        System.out.println(numMax);
    }
}
