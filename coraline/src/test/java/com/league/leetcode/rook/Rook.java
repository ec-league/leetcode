package com.league.leetcode.rook;

/**
 * Created by coraline on 2019/3/11.
 */
public class Rook {

    public static int numRookCaptures(char[][] board) {

        int count = 0;
        int ri = 0;
        int rj = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if ('R' == board[i][j]) {
                    ri = i;
                    rj = j;
                    break;
                }

            }
        }
        for (int i = ri; i < board[rj].length; i++) {
            if (board[i][rj] == 'p') {
                count++;
                break;

            } else if (board[i][rj] == 'B') {
                break;
            }
        }
        for (int i = ri; i >= 0; i--) {
            if (board[i][rj] == 'p') {
                count++;
                break;

            } else if (board[i][rj] == 'B') {
                break;
            }
        }
        for (int j = rj; j < board.length; j++) {
            if (board[ri][j] == 'p') {
                count++;
                break;

            } else if (board[ri][j] == 'B') {
                break;
            }
        }
        for (int j = rj; j >= 0; j--) {
            if (board[ri][j] == 'p') {
                count++;
                break;
            } else if (board[ri][j] == 'B') {
                break;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        char[][] board = {{'.','.','.','.','.','.','.','.'},{'.','.','.','p','.','.','.','.'},{'.','.','.','p','.','.','.','.'},{'p','p','.','R','.','p','B','.'},{'.','.','.','.','.','.','.','.'},{'.','.','.','B','.','.','.','.'},{'.','.','.','p','.','.','.','.'},{'.','.','.','.','.','.','.','.'}};

        System.out.println(numRookCaptures(board));

    }
}
