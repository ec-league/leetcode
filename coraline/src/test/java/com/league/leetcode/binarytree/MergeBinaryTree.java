package com.league.leetcode.binarytree;

/**
 * Created by coraline on 2019/3/13.
 */
public class MergeBinaryTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {

        int height1 = getTreeHeight(t1, 0);
        int height2 = getTreeHeight(t2, 0);
        return null;

    }


    private int getTreeHeight(TreeNode t1, int height) {
        if (null == t1) {
            return height;
        }
        height++;
        int left = getTreeHeight(t1.left, height);
        int right = getTreeHeight(t1.right, height);
        return left > right ? left : right;
    }


}
