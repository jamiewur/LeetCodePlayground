package Algorithm.Easy;

import java.util.HashSet;
import java.util.PriorityQueue;

public class LargestUniqueNumber {
    public int largestUniqueNumber(int[] A) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(A.length);
        HashSet<Integer> repeat = new HashSet<>();
        for(int a:A){
            if(!queue.contains(a) && !repeat.contains(a)) queue.offer(a);
            else {
                queue.remove(a);
                repeat.add(a);
            }
        }
        int n = queue.size();
        if(n>0) {
            for (int i = 0; i < n - 1; i++) {
                queue.poll();
            }
            return queue.peek();
        }
        else return -1;
    }
}
