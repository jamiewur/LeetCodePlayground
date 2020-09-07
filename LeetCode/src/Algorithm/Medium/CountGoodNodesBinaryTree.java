package Algorithm.Medium;

import Algorithm.Assist.TreeNode;

public class CountGoodNodesBinaryTree {
    // 1. Each node compare the val with the max in this path
    // 2. If ture, add the value to the sum and update max value
    int sum = 0;

    public int goodNodes(TreeNode root) {
        goodNodeHelper(root, Integer.MIN_VALUE);
        return sum;
    }
    private void goodNodeHelper(TreeNode node, int max) {
        if (node == null) return;
        int value = node.val;
        if (value >= max) {
            sum ++;
            max = value;
        }
        goodNodeHelper(node.left, max);
        goodNodeHelper(node.right,max);
    }
}
