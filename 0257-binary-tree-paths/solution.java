/*
 * @lc app=leetcode id=257 lang=java
 *
 * [257] Binary Tree Paths
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

import java.util.*;

class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<Integer> path = new ArrayList<>();
        List<String> res = new ArrayList<>();

        helper(root, path, res);
        return res;
    }

    public static void helper(TreeNode root, List<Integer> path, List<String> res) {
        path.add(root.val);

        if (root.left == null && root.right == null) {
            res.add(createPath(path));
        }

        if (root.left != null) {
            helper(root.left, path, res);
            path.removeLast();
        }
        if (root.right != null) {
            helper(root.right, path, res);
            path.removeLast();
        }
    }

    public static String createPath(List<Integer> path) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < path.size() - 1; i++) {
            sb.append(path.get(i));
            sb.append("->");
        }
        sb.append(path.getLast());

        return sb.toString();
    }
}
// @lc code=end

