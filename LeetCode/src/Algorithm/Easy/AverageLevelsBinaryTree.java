package Algorithm.Easy;

import Algorithm.Assist.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageLevelsBinaryTree {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            double size = queue.size(), sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode curNode = queue.remove();
                if (curNode.left != null) queue.offer(curNode.left);
                if (curNode.right != null) queue.offer(curNode.right);
                sum += curNode.val;
            }
            list.add(sum/size);
        }
        return list;
    }
}
