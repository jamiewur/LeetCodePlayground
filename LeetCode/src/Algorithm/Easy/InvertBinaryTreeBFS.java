package Algorithm.Easy;

import Algorithm.Assist.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTreeBFS {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        while (! queue.isEmpty()){
            TreeNode curNode = queue.poll();
            TreeNode curNodeL = curNode.left;
            curNode.left = curNode.right;
            curNode.right = curNodeL;

            if(curNode.left != null) {
                queue.offer(curNode.left);
            }
            if(curNode.right != null) {
                queue.offer(curNode.right);
            }
        }



        return root;
    }
}
