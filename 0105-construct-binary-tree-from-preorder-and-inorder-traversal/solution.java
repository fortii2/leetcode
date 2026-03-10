/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    public TreeNode build(int[] preorder, int preL, int preR, int[] inorder, int inL, int inR) {

        if (preL > preR) {
            return null;
        }

        int rootVal = preorder[preL];
        TreeNode root = new TreeNode(rootVal);

        int index = -1;
        for (int i = inL; i <= inR; i++) {
            if (inorder[i] == rootVal) {
                index = i;
                break;
            }
        }

        int leftSize = index - inL;

        root.left = build(preorder, preL + 1, preL + leftSize, inorder, inL, index - 1);
        root.right = build(preorder, preL + leftSize + 1, preR, inorder, index + 1, inR);

        return root;
    }
}
