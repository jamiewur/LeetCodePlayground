package Algorithm.Easy;

import Algorithm.Assist.ListNode;

public class MiddleLinkedList {
    int n = 0;
    int c = 0;
    public ListNode middleNode(ListNode head) {
        accountNode(head);
        c = n/2;
        return findNode(head);

    }

    public void accountNode(ListNode node){
        if(node.next != null){
            n++;
            accountNode(node.next);
        }else n++;
    }

    public ListNode findNode(ListNode node){
        ListNode l = node;
        for(int i=0; i<c;i++){
            l = l.next;
        }
        return l;
    }
}
