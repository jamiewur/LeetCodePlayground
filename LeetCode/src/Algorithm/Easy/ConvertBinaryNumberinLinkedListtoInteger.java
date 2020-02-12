package Algorithm.Easy;

import Algorithm.Assist.ListNode;

import java.util.ArrayList;

public class ConvertBinaryNumberinLinkedListtoInteger {
    public int getDecimalValue(ListNode head) {
        int a = 0;
        ArrayList<Integer> b = new ArrayList<>();

        while (head != null){
            b.add(head.val);
            head = head.next;
        }

        int l = b.size();
        for(int i:b){
            a += i == 1 ? Math.pow(2,l-1) : 0;
            l -= 1;
        }
        return a;
    }
}
