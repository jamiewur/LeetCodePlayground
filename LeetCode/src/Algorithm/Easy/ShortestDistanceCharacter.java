package Algorithm.Easy;

import java.util.ArrayList;

public class ShortestDistanceCharacter {
    public int[] shortestToChar(String S, char C) {
        int n = S.length();
        int [] A = new int[n];
        ArrayList<Integer> a = new ArrayList<>();

        for(int i=0;i<n;i++){
            if(S.charAt(i) == C) a.add(i);
        }

        for(int j=0; j<n;j++){
            int distance = 99999;
            for(int b:a){
                distance = Math.abs(b-j)<distance? Math.abs(b-j):distance;
            }
            A[j] = distance;
        }
        return A;
    }
}
