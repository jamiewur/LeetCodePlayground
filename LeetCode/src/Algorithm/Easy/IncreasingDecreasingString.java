package Algorithm.Easy;

import java.util.ArrayList;
import java.util.TreeMap;
import java.util.TreeSet;

public class IncreasingDecreasingString {
    public String sortString(String s) {
        StringBuilder ans = new StringBuilder();
        TreeMap<Character, Integer> tm = new TreeMap<>();
        for (char c : s.toCharArray()) {
            tm.put(c, 1 + tm.getOrDefault(c, 0));
        }
        boolean asc = true;
        while (!tm.isEmpty()) {
            for (char c : asc ? new TreeSet<>(tm.keySet()) : new TreeSet<>(tm.descendingKeySet())) {
                ans.append(c);
                tm.put(c, tm.get(c) - 1);
                tm.remove(c, 0);
            }
            asc = !asc; // same as asc ^= true;
        }
        return ans.toString();

    }
}
