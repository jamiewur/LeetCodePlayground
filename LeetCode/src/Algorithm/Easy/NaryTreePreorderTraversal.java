package Algorithm.Easy;

import Algorithm.Assist.Node;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class NaryTreePreorderTraversal {
    public List<Integer> preorder(Node root) {

        LinkedList<Integer> op = new LinkedList<>();
        LinkedList<Node> nlist = new LinkedList<>();

        if ( root == null ) return op;

        nlist.add(root);

        while ( !nlist.isEmpty() ) {
            Node cn= nlist.pollLast();
            op.add(cn.val);
            Collections.reverse(cn.children);
            for (Node n : cn.children) {
                nlist.add(n);
            }
        }
        return op;
    }
}
