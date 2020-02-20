package Algorithm.Easy;

import java.util.*;

public class UniqueNumberofOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> m = new HashMap<>();

        for (int a: arr){
            m.put(a, 1 + m.getOrDefault(a, 0));
        }

        return m.size() == new HashSet<>(m.values()).size();
    }
}
