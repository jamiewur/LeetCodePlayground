package Algorithm.Medium;

import Algorithm.Assist.TreeNode;

import java.util.*;

public class DeleteNodesAndReturnForest {
    // 1. Every node add to the result list, is the root
    // 2. Tree problem == recursion
    // 3. This is a pre order traversal
    // ** If the node is deleted, its children will be root, meanwhile, return a null to its parent
    List<TreeNode> list;
    HashSet<Integer> set;
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        list = new ArrayList<>();
        set = new HashSet<>();
        for (int i: to_delete) set.add(i);
        delHelper(root, true);
        return list;
    }
    private TreeNode delHelper(TreeNode root, boolean is_root) {
        if (root == null) return null;
        boolean is_deleted = set.contains(root.val);
        if (is_root && !is_deleted) list.add(root);
        root.left = delHelper(root.left, is_deleted);
        root.right = delHelper(root.right, is_deleted);
        return is_deleted ? null : root;
    }
}
