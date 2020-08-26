package Algorithm.Easy;

import Algorithm.Assist.TreeNode;

public class ConvertSortedArrayBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) return null;
        return help(nums, 0, nums.length-1);
    }
    public TreeNode help(int[] nums, int low, int high) {
        if (low > high) return null;
        int mid = low + (high - low)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = help(nums, low, mid-1);
        node.right = help(nums, mid+1, high);
        return node;
    }
}
