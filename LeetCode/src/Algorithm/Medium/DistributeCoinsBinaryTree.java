package Algorithm.Medium;

import Algorithm.Assist.TreeNode;

import java.util.ArrayList;

public class DistributeCoinsBinaryTree {
    int res = 0;
    public int distributeCoins(TreeNode root) {
        findNodes(root);
        return res;
    }
    private int findNodes (TreeNode root) {
        if (root == null) return 0;
        int left = findNodes(root.left);
        int right = findNodes(root.right);
        res += Math.abs(left) + Math.abs(right);
        return root.val + left + right -1;
    }

}
