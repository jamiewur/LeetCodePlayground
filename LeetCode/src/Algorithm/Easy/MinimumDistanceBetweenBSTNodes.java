package Algorithm.Easy;

import Algorithm.Assist.TreeNode;

public class MinimumDistanceBetweenBSTNodes {
    Integer minDis = Integer.MAX_VALUE;
    Integer cur = null;
    public int minDiffInBST(TreeNode root) {
        inFindTheMin(root);
        cur = root.val;
        return minDis;
    }

    public void inFindTheMin(TreeNode root) {
        if (root == null) return ;
        inFindTheMin(root.left);
        if (cur != null) {
            minDis = Math.min(minDis, root.val - cur);
        }
        cur = root.val;
        inFindTheMin(root.right);
    }

    public void preFindTheMin(TreeNode root) {
        if (root == null) return;
        if (root.left != null) {
            minDis = Math.min(root.val - root.left.val, minDis);
            if (cur != null) minDis = Math.min(minDis, Math.abs(cur - root.left.val));
        }
        if (root.right != null) {
            minDis = Math.min(root.right.val - root.val, minDis);
            if (cur != null) minDis = Math.min(minDis, Math.abs(cur - root.right.val));
        }
        cur = root.val;
        preFindTheMin(root.left);
        preFindTheMin(root.right);
    }
}
