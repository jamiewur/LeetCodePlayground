package Algorithm.Medium;

import Algorithm.Assist.TreeNode;

import java.util.ArrayList;
import java.util.Collections;

public class MaximumDifferenceBetweenNodeAncestor {
    public int maxAncestorDiff(TreeNode root) {
        return helper(root, root.val, root.val);
    }
    private int helper (TreeNode node, int max, int min) {
        if (node == null) return max - min;
        if (node.val > max) max = node.val;
        if (node.val < min) min = node.val;
        int left = helper(node.left, max, min);
        int right = helper(node.right, max, min);
        return Math.max(left, right);
    }
}
