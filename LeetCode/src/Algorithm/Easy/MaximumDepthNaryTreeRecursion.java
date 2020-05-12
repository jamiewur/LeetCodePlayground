package Algorithm.Easy;

import Algorithm.Assist.Node;

public class MaximumDepthNaryTreeRecursion {

    public int maxDepth(Node root) {
        // base case of the recursion
        if (root == null) return 0;

        // ini the value, which the recursion start from
        int max= 0;

        // to do some literate in recursion and compare each of the value by max
        for (Node child: root.children) {
            max = Math.max(maxDepth(child), max);
        }

        return max + 1;
    }
}
