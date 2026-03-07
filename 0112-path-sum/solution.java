/*
 * @lc app=leetcode id=112 lang=java
 *
 * [112] Path Sum
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null)
            return false;

        return helper(root, targetSum - root.val);
    }

    public boolean helper(TreeNode root, int count) {
        if (root.left == null && root.right == null && count == 0) {
            return true;
        }

        if (root.left == null && root.right == null && count != 0) {
            return false;
        }

        if (root.left != null) {
            if (helper(root.left, count - root.left.val))
                return true;
        }

        if (root.right != null) {
            if (helper(root.right, count - root.right.val))
                return true;
        }

        return false;
    }
}
// @lc code=end

