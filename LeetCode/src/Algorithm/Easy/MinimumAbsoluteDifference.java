package Algorithm.Easy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {

        // Declare the list
        List<List<Integer>> result = new ArrayList<>();

        // Declare the minimum difference
        int min = Integer.MAX_VALUE;

        // Sort the array
        Arrays.sort(arr);

        // Get the minimum difference
        for(int i=0; i<arr.length-1; i++){
            int difference = Math.abs(arr[i+1]-arr[i]);
            if(difference<min) min = difference;
        }

        // Get the minimum difference pairs
        for(int i=0; i<arr.length-1; i++){
            int difference = Math.abs(arr[i+1]-arr[i]);
            if(difference == min){
                List<Integer> list = new ArrayList<>();
                list.add(arr[i]);
                list.add(arr[i+1]);
                result.add(list);
            }
        }
        return result;
    }
}
