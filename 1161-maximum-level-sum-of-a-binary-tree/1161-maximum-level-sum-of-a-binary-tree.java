class Solution {
    public int maxLevelSum(TreeNode root) {
        if (root == null)
            return 0;

        int maxnow = root.val;
        int LvLmax = 1;
        int lvl = 1;

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int lvlSize = queue.size();
            int sum = 0;
            for (int i = 0; i < lvlSize; i++) {
                TreeNode node = queue.poll();
                sum += node.val;
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            if (sum > maxnow) {
                maxnow = sum;
                LvLmax = lvl;
            }

            lvl++;
        }
        return LvLmax;
    }
}