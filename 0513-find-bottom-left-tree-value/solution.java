/*
 * @lc app=leetcode id=513 lang=java
 *
 * [513] Find Bottom Left Tree Value
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
    int maxDep = -1;
    int value = 0;

    public int findBottomLeftValue(TreeNode root) {
        value = root.val;
        finder(root, 0);
        return value;
    }

    public void finder(TreeNode root, int deep) {
        if (root == null)
            return;

        if (root.left == null && root.right == null) {
            if (deep > maxDep) {
                maxDep = deep;
                value = root.val;
            }
        }

        if (root.left != null) {
            deep++;
            finder(root.left, deep);
            deep--;
        }

        if (root.right != null) {
            deep++;
            finder(root.right, deep);
            deep--;
        }
    }
}
// @lc code=end

