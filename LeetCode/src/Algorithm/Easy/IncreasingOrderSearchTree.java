package Algorithm.Easy;

import Algorithm.Assist.TreeNode;

public class IncreasingOrderSearchTree {
    TreeNode prev,head = null;

    public TreeNode increasingBST(TreeNode root) {
        if( root == null ) return null;

        // inorder
        increasingBST(root.left);

        // construct a node tree
        if ( prev != null ) {
            root.left = null;
            prev.right = root;
        }

        if ( head == null ) head = root;

        prev = root;



        increasingBST(root.right);

        return head;
    }
}
