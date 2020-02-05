package Algorithm.Easy;

import java.util.ArrayList;

public class DecompressRunLengthEncodedList {
    public int[] decompressRLElist(int[] nums) {
        // Declare the data structure
        ArrayList<Integer> a = new ArrayList<>();
        int iMax = nums.length/2;

        // For each of the value, add the value to the array list repeatedly
        for(int i=0;i<iMax;i++){
            int freq = nums[2 * i];
            int val = nums[(2 * i) + 1];
            for (int j=0;j<freq;j++) {
                a.add(val);
            }
        }

        // Convert the arrayList to int array, and return
        return a.stream().mapToInt(i->i).toArray();

    }
}
