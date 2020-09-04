package Algorithm.Easy;

import Algorithm.Assist.TreeNode;

import java.util.HashMap;

public class DeepestLeavesSum {
    // 1. Find the deepest node by recursion
    // 2. Update deepest layer of the node
    // 3. If current node's layer is equal to deepest layer, add the number to the sum
    // 4. If there is another deepest node, then delete previous sum, and add current one to the sum
    int layer = 0;
    int sum = 0;
    public int deepestLeavesSum(TreeNode root) {
        findDeepestLeaves(root, 0);
        return sum;
    }
    private void findDeepestLeaves(TreeNode node, int curLayer) {
        if (node == null) return;
        if (node.left != null) findDeepestLeaves(node.left, curLayer+1);
        if (node.right != null) findDeepestLeaves(node.right, curLayer+1);
        if (node.left == null && node.right == null) {
            if (curLayer == layer) sum += node.val;
            else if (curLayer > layer ) {
                sum = node.val;
                layer = curLayer;
            }
        }
    }
}
