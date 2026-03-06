class Solution {
    public int minDepth(TreeNode root) {
        return minHeight(root);
    }

    public int minHeight(TreeNode root){
        if (root == null) {
            return 0;
        }

        int minL = minHeight(root.left);
        int minR = minHeight(root.right);

        if (root.left == null && root.right != null) {
            return 1 + minR;
        }

        if (root.right == null && root.left != null) {
            return 1 + minL;
        }

        return 1 + Math.min(minL, minR);
    }
}
