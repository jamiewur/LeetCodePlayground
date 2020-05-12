package Algorithm.Easy;

import Algorithm.Assist.TreeNode;

public class UnivaluedBinaryTree {
    int unival = 0;

    public boolean isUnivalTree(TreeNode root) {
        if (root == null) return false;
        unival = root.val;
        return recursion(root);
    }

    public boolean recursion (TreeNode root) {
        if (root == null) return true;

        int a = root.val;

        return a == unival && recursion(root.left) && recursion(root.right);
    }
}
