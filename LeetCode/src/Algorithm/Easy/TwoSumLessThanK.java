package Algorithm.Easy;

import java.util.ArrayList;
import java.util.Collections;

public class TwoSumLessThanK {
    public int twoSumLessThanK(int[] A, int K) {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        for(int o:A){
            if (o<K) a.add(o);
        }
        for(int i=0;i<a.size();i++){
            for(int j=i+1;j<a.size();j++){
                int sum = a.get(i)+a.get(j);
                if(sum<K) b.add(sum);
            }
        }
        Collections.sort(b);
        if(b.size()==0) return -1;
        else return b.get(b.size()-1);
    }
}
