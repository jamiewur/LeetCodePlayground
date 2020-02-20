package Algorithm.Easy;

import Algorithm.Assist.TreeNode;

public class SearchinBinarySearchTree {
    public TreeNode searchBST(TreeNode root, int val) {
        int rv = root.val;
        int cv = val;
        TreeNode tr = root;
        // Find the node
        while (rv != cv) {
            if (rv > cv) {
                if ( tr.left != null){
                    tr = tr.left;
                    rv = tr.val;
                } else return null;
            }
            else {
                if (tr.right != null){
                    tr = tr.right;
                    rv = tr.val;
                } else return null;
            }
        }

            TreeNode m = new TreeNode(tr.val);
            m.left = tr.left;
            m.right = tr.right;
            return m;

    }
}
