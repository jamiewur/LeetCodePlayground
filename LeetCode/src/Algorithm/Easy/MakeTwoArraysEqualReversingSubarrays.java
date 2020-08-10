package Algorithm.Easy;

import java.util.HashSet;

public class MakeTwoArraysEqualReversingSubarrays {
    public boolean canBeEqual(int[] target, int[] arr) {
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();
        int sum1 = 0, sum2 = 0;

        for (int c: arr) {
            s1.add(c);
            sum1 += c;
        }
        for (int c: target) {
            s2.add(c);
            sum2 += c;
        }

        return s1.size() == s2.size() && sum1 == sum2;
    }
}
