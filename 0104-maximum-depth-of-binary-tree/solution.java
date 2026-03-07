class Solution {
    public int maxDepth(TreeNode root) {
        return maxHeight(root);
    }

    public int maxHeight(TreeNode node){
        if(node == null){
            return 0;
        }

        int left = maxHeight(node.left);
        int right = maxHeight(node.right);

        return 1 + Math.max(left, right);
    }
}
