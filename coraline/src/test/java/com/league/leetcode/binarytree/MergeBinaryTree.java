package com.league.leetcode.binarytree;

import org.junit.Test;

/**
 * Created by coraline on 2019/3/13.
 */
public class MergeBinaryTree {

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (null == t1 && null == t2) {
            return null;
        } else if (null == t1) {
            return t2;
        } else if (null == t2) {
            return t1;
        }
        TreeNode root = new TreeNode(t1.val + t2.val);
        TreeNode left1 = t1.left;
        TreeNode left2 = t2.left;
        TreeNode right1 = t1.right;
        TreeNode right2 = t2.right;

        root.left = mergeTrees(left1, left2);
        root.right = mergeTrees(right1, right2);

        return root;

    }

    private void recurseTree(TreeNode temp) {
        if (null == temp) {
            return;
        }
        System.out.println(temp.val);
        recurseTree(temp.left);
        recurseTree(temp.right);
    }

    @Test
    public void test() {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        left.left = new TreeNode(4);
        left.right = new TreeNode(5);
        root.left = left;
        root.right = new TreeNode(3);
        recurseTree(root);

    }

}
