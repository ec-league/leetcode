package com.league.cards.primary.string;

/**
 * Created by coraline on 2020/4/13.
 */
public class Reverse {

    public static int reverse(int x) {
        if(x == 0){
            return 0;
        }
        String xStr = String.valueOf(x);
        char[] s = xStr.toCharArray();
        int len = s.length;

        StringBuilder str = new StringBuilder("");
        if (x < 0) {
            str.append("-");
        }

        boolean isOnlyZero = true;
        for (int i = len - 1; i >= 0; i--) {
            if (s[i] == '-') {
                continue;
            }
            if(s[i] != '0'){
                isOnlyZero = false;
            }
            if(s[i] == '0' && isOnlyZero){
                continue;
            }
            str.append(s[i]);
        }
        int ret = 0;
        try{
            ret = Integer.valueOf(str.toString());

        }
        catch (NumberFormatException ex){

        }

        return ret;
    }

    public static void main(String[] args) {
        int x = 1534236469;
        int ret = reverse(x);
        System.out.println(ret);

    }
}
