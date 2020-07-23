package Algorithm.Easy;

import java.util.*;

public class Test5 {
    public int solution(int[] A, int[] B, int N) {
        // write your code in Java SE 8

        // Special case
        // Normal
        Map<Integer, ArrayList<Integer>> citiMap = new HashMap<>();

        for (int i = 0; i < B.length ; i++) {
            ArrayList <Integer> curArray = citiMap.getOrDefault(A[i],new ArrayList<>());
            curArray.add(B[i]);
            citiMap.put(A[i], curArray);
            curArray = citiMap.getOrDefault(B[i],new ArrayList<>());
            curArray.add(A[i]);
            citiMap.put(B[i], curArray);
        }

        LinkedList<Integer> maxCity = new LinkedList<>();
        int cmaxRank = Integer.MIN_VALUE;
        int secRank = Integer.MIN_VALUE;

        for (Integer i: citiMap.keySet()) {
            if (citiMap.get(i).size() > cmaxRank ) {
                secRank = cmaxRank;
                cmaxRank = citiMap.get(i).size();
            }
        }

        return citiMap.get(cmaxRank).size() + citiMap.get(secRank).size();
    }
}
