package Algorithm.Easy;
import Algorithm.Assist.TreeNode;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
public class RangeSumOfBST {
    int sum;
    public int rangeSumBST(TreeNode root, int L, int R) {
        sum = 0;
        recursive(root,L,R);
        return sum;
    }

    public void recursive(TreeNode node, int L,int R){
        if(node != null){
            if(L<=node.val && R>=node.val){
                sum+=node.val;
                recursive(node.left,L,node.val);
                recursive(node.right,node.val,R);
            }
            else if(node.val > R){
                recursive(node.left,L,R);
            }
            else if(node.val < L){
                recursive(node.right,L,R);
            }
        }
        else return ;
    }


}
