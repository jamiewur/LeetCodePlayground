package Algorithm.Easy;

import Algorithm.Assist.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NaryTreePostorderTraversal {

    List<Integer> list = new ArrayList<>();
    public List<Integer> postorder(Node root) {
        // DFS postorder
        /* LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Integer> output = new LinkedList<>();

        if (root == null) {
            return output;
        }

        stack.add(root);
        while (!stack.isEmpty()) {
            Node node = stack.pollLast();
            output.addFirst(node.val);
            for (Node item : node.children) {
                if (item != null) {
                    stack.add(item);
                }
            }
        }

         */

        // Recursive
        if (root == null) return list;

        for (Node node: root.children) postorder(node);

        list.add(root.val);

        return list;
    }
}
