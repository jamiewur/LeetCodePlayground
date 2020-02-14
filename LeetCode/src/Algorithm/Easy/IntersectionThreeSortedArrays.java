package Algorithm.Easy;

import java.util.ArrayList;
import java.util.List;

public class IntersectionThreeSortedArrays {
    public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
            ArrayList<Integer> a = new ArrayList<>();

            for (int i: arr1){
                secondLoop:
                for (int j: arr2){
                    if ( j == i ) {
                        for (int n: arr3){
                            if ( n == j){
                                a.add(n);
                                break secondLoop;
                            }
                        }
                    }
                }
            }
            return a;
    }
}
