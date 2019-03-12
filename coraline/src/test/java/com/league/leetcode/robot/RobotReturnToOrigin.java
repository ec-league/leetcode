package com.league.leetcode.robot;

/**
 * Created by coraline on 2019/3/6.
 */
public class RobotReturnToOrigin {
    public static boolean judgeCircle(String moves) {

        if (null == moves || 0 == moves.length()) {
            return true;
        }
        int x = 0;
        int y = 0;
        char[] moveArr = moves.toCharArray();
        for (char item : moveArr) {
            if ('U' == item) {
                y++;
            } else if ('D' == item) {

                y--;
            } else if ('L' == item) {

                x--;
            } else if ('R' == item) {

                x++;
            }
        }
        if ((y == 0) && (x == 0)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        String moves = "UD";
        System.out.println(judgeCircle(moves));
    }


}
