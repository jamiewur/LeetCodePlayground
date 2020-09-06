package Algorithm.Medium;

import Algorithm.Assist.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SumNodesEvenValuedGrandparent {
    public int sumEvenGrandparent(TreeNode root) {
        if (root == null) return 0;
        return sumEvenGrandparentHelper(root, null, null);
    }
    private int sumEvenGrandparentHelper(TreeNode CurRoot, TreeNode ParRoot, TreeNode GraRoot) {
        if (CurRoot == null) return 0;
        int left = sumEvenGrandparentHelper(CurRoot.left, CurRoot, ParRoot);
        int right = sumEvenGrandparentHelper(CurRoot.right, CurRoot, ParRoot);
        if (GraRoot != null && GraRoot.val % 2 == 0) return CurRoot.val + left+ right;
        return left + right;
    }
}
