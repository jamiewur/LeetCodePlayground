package Algorithm.Easy;

import Algorithm.Assist.TreeNode;

public class PathSum {
    boolean has = false;
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        hasPathSumHelper(root,sum,root.val);
        return has;
    }

    // * The previous function need a helper function to DFS each node
    // * The hasPathHelper means if the node from root to current leaf has a path that the sum equals to the result
    // * At each step, the base case is the node is a leaf node, which means we need to check the sum of the val from
    // root to current leaf is equal to the sum. If yes, assign the "true" to the global variable
    // * If this node is not the leaf, then the recursion continue.
    private void hasPathSumHelper(TreeNode root, int sum, int cur) {
        if (root.left == null && root.right == null) {
            if (cur == sum) has = true;
            return;
        }
        if (root.left != null) hasPathSumHelper(root.left, sum, cur+root.left.val);
        if (root.right != null) hasPathSumHelper(root.right, sum, cur+root.right.val);
    }
}
