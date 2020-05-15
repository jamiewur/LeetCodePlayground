package Algorithm.Easy;

import java.util.Arrays;

public class RelativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int [] all = new int[1000];
        int [] res = new int[arr1.length];
        int pivot = 0;

        for (int a: arr1) all[a]++;

        for (int c: arr2) {
            Arrays.fill(res, pivot, pivot + all[c], c);
            pivot += all[c];
            all[c] = 0;
        }

        for (int k = 0; k <= 1000; k++) {
            if (all[k] > 0) {
                Arrays.fill(res, pivot, pivot + all[k], k);
                pivot += all[k];
            }
        }

        return res;
    }
}
