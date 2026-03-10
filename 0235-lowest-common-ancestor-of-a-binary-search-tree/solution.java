/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        int s = Math.min(p.val, q.val);
        int b = Math.max(p.val, q.val);

        return finder(root, s, b);
    }

    public TreeNode finder(TreeNode root, int s, int b) {
        if (root == null) {
            return null;
        }

        if (s <= root.val && root.val <= b) {
            return root;
        }

        if (s < root.val && b < root.val) {
            return finder(root.left, s, b);
        }

        if (s > root.val && b > root.val) {
            return finder(root.right, s, b);
        }

        return null;
    }
}
