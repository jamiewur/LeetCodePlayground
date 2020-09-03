package Algorithm.Easy;

import Algorithm.Assist.TreeNode;

public class MinimumDepthBinaryTree {
    public int minDepth(TreeNode root) {
        // If it is a null node, its self depth will be 0;
        if (root == null) return 0;
        // The min Depth of Left child of the node
        int left = minDepth(root.left);
        // The min Depth of Right child of the node
        int right = minDepth(root.right);
        // Return
        //*If one of the child is null, then the min depth will be one of the min depth either left or right
        //*Btw, if one of the child is null, then the node mustn't be 0
        //*When the node has both side of the node, then return the min one
        return (left == 0 || right == 0 ) ? left + right + 1 : Math.min(left,right);
    }
}
