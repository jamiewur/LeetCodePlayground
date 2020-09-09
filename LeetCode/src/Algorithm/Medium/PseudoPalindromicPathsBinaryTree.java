package Algorithm.Medium;

import Algorithm.Assist.TreeNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PseudoPalindromicPathsBinaryTree {
    public int pseudoPalindromicPaths (TreeNode root) {
        return canBePalindrome(root,new HashSet());
    }

    private int canBePalindrome(TreeNode node, Set<Integer> numbers){
        if(node==null) return 0;
        if(numbers.contains(node.val)){
            numbers.remove(node.val);
        }else{
            numbers.add(node.val);
        }
        if(node.left==null&& node.right==null){
            return numbers.size()<=1?1:0; // thanks to @MananS77
        }
        int left=canBePalindrome(node.left,new HashSet(numbers));
        int right=canBePalindrome(node.right,new HashSet(numbers));
        return left+right;
    }
}
