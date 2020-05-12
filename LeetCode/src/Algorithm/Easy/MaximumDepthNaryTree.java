package Algorithm.Easy;

import Algorithm.Assist.Node;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthNaryTree {
    public int maxDepth(Node root) {
        if (root == null) return 0;

        Queue<Node> queue = new LinkedList<>();

        int deep = 0;

        queue.offer(root);

        while ( !queue.isEmpty()) {

            int size = queue.size();

            for (int s = 0; s < size; ++s) {
                Node curNode = queue.poll();
                for (Node n: curNode.children) queue.offer(n);
            }

            deep++;
        }

        return deep;
    }
}
