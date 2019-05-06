package com.league.leetcode.islands;

/**
 * Created by coraline on 2019/5/6.
 */
public class NumIslands {

    public static int numIslands(char[][] grid) {
        if (null == grid || 0 == grid.length) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (49 == grid[i][j]) {
                    count++;
                }
                dfs(grid, i, j);
            }
        }

        return count;
    }

    private static void dfs(char[][] grid, int i, int j) {
        grid[i][j] = 0;
        if (i == grid.length || j == grid[0].length) {
            return;
        }
        if (grid[i + 1][j] == 49) {
            i++;
        }
        if(grid[i][j + 1] == 49){
            j++;
        }
        if (grid[i+1][j] == 0) {
            return;
        }
        dfs(grid, i, j);
    }

    public static void main(String[] args) {
        char[][] charArr = {{'1', '1', '1', '1', '0'}, {'1', '1', '0', '1', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '0', '0', '0'}};
        int count = numIslands(charArr);
        System.out.println(count);
    }
}
