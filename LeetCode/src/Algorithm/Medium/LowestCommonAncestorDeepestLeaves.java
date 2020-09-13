package Algorithm.Medium;

import Algorithm.Assist.TreeNode;

public class LowestCommonAncestorDeepestLeaves {
    int deepest_layer;
    TreeNode cur_node;
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        deepest_layer = 0;
        lcaDeepestLeavesHelper(root, 0);
        return cur_node;
    }
    private int lcaDeepestLeavesHelper(TreeNode node, int layer) {
        deepest_layer = Math.max(deepest_layer, layer);
        if (node == null) return layer;
        int left = lcaDeepestLeavesHelper(node.left, layer + 1);
        int right = lcaDeepestLeavesHelper(node.right, layer + 1);
        if (left == deepest_layer && right == deepest_layer) cur_node = node;
        return Math.max(left, right);
    }
}
