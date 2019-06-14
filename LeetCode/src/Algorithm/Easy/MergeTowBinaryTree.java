package Algorithm.Easy;


import Algorithm.Assist.TreeNode;

public class MergeTowBinaryTree {
    private static final String Unvisited = "U";
    private static final String visited = "V";
    String state = Unvisited;

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        TreeNode currentNode;
        if (t1 != null && t2 != null) {
            currentNode = new TreeNode(t1.val + t2.val);
            currentNode.left = mergeTrees(t1.left, t2.left);
            currentNode.right = mergeTrees(t1.right, t2.right);
        } else if (t1 == null && t2 != null) {
            currentNode = new TreeNode(t2.val);
            currentNode.left = mergeTrees(null, t2.left);
            currentNode.right = mergeTrees(null, t2.right);
        } else if (t1 != null && t2 == null){
            currentNode = new TreeNode(t1.val);
            currentNode.left = mergeTrees(t1.left,null);
            currentNode.right = mergeTrees(t1.right,null);
        } else {
            currentNode = null;
        }

        return currentNode;
    }
}
