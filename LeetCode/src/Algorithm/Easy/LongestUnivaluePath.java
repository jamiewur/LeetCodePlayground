package Algorithm.Easy;

import Algorithm.Assist.TreeNode;

import java.util.HashMap;

public class LongestUnivaluePath {
    int max = 0;
    public int longestUnivaluePath(TreeNode root) {
        if (root == null) return 0;
        findPath(root);
        return max;
    }

    public int findPath(TreeNode root) {
        if (root == null) return 0;
        int left = findPath(root.left), right = findPath(root.right);
        max = Math.max(max, left + right);
        return Math.max(left,right);
    }
}
