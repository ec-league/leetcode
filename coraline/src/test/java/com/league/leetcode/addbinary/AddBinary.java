package com.league.leetcode.addbinary;

/**
 * Created by coraline on 2020/1/16.
 */
public class AddBinary {

    public static String addBinary(String a, String b) {

        String ret = "";
        if ((null == a && null == b) || ("" == a && "" == b)) {
            return ret;
        } else if (null == a || "" == a) {
            return b;
        } else if (null == b || "" == b) {
            return a;
        }

        char[] aArr = a.toCharArray();
        char[] bArr = b.toCharArray();
        char[] result = null;
        char[] longerArr = null;
        int lenLong = 0;
        int lenShort = 0;
        if (aArr.length >= bArr.length) {
            result = new char[aArr.length + 1];
            lenLong = aArr.length + 1;
            lenShort = bArr.length;
            longerArr = aArr;
        } else if (bArr.length >= aArr.length) {
            result = new char[bArr.length + 1];
            lenLong = bArr.length + 1;
            lenShort = aArr.length;
            longerArr = bArr;
        }

        for (int i = 0; i < lenLong; i++) {
            if (i < lenShort && aArr[i] + bArr[i] >= 2) {
                result[i] = 0;
                if (1 == result[i]) {
                    result[i] += 1;
                    result[i + 1] = 1;
                }

            } else if (i < lenShort && aArr[i] + bArr[i] < 2) {
                if (1 == result[i]) {
                    result[i] += longerArr[i] + 1;

                } else {
                    result[i] += longerArr[i];
                }
            }
            else if (i > lenShort) {
                if (1 == result[i]) {
                    result[i] += longerArr[i] + 1;

                } else {
                    result[i] += longerArr[i];
                }
            }
        }


        return ret;
    }

    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        String result = addBinary(a, b);
        System.out.println(result);
    }
}
