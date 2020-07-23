package Algorithm.Easy;

import java.util.HashMap;
import java.util.Map;

public class Test4 {
    public int solution(int[] A) {
        // write your code in Java SE 8
        if (A.length == 0) return 0;

        Map<Integer, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        boolean hasRes = false;

        // put the value and the times into the map
        for (int a: A) {
            map.put( a, map.getOrDefault(a, 0) + 1 );
        }

        // get the res
        for (Integer key: map.keySet()) {
            if ( key.equals(map.get(key))) {
                hasRes = true;
                if (key > max) max = key;
            }

        }
        return hasRes ? max : 0;
    }
}
