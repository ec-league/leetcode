package com.league.LOCF;

/**
 * Created by coraline on 2020/12/4.
 */
public class SymmetricTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isSymmetric(TreeNode root) {

        if(null == root){
            return false;
        }


        return compareSubTreeRecursively(root.left, root.right);

    }

    public boolean compareSubTreeRecursively(TreeNode left, TreeNode right){
        if(null == left && null == right){
            return true;
        }

        if(null == left || null == right){
            return false;
        }

        return (left.val == right.val) && compareSubTreeRecursively(left.left, right.right) && compareSubTreeRecursively(left.right, right.left);
    }
}
