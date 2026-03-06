class Solution {
    public boolean isBalanced(TreeNode root) {
        return getHeight(root) != -1;
    }

    public static int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftH = getHeight(root.left);
        if (leftH == -1) {
            return -1;
        }

        int rightH = getHeight(root.right);
        if (rightH == -1) {
            return -1;
        }

        if (Math.abs(leftH - rightH) > 1) {
            return -1;
        } else {
            return 1 + Math.max(leftH, rightH);
        }
    }
}

