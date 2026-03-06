class Solution {
    public int countNodes(TreeNode root) {
        int count = 0;

        if (root == null) {
            return count;
        }

        Deque<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        count++;

        while (!q.isEmpty()) {
            TreeNode cur = q.poll();

            if (cur.left != null) {
                q.offer(cur.left);
                count++;
            }

            if (cur.right != null) {
                q.offer(cur.right);
                count++;
            }
        }

        return count;
    }
}
