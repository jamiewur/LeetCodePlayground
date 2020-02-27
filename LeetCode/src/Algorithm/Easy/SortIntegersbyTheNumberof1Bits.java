package Algorithm.Easy;

import java.util.*;

public class SortIntegersbyTheNumberof1Bits {
    public int[] sortByBits(int[] arr) {
        Integer[] boxedArray = Arrays.stream(arr).boxed().toArray(Integer[]::new);

        //Sort based on bitCount, if bit count equal sort by value
        Arrays.sort(boxedArray, (a , b) ->
                Integer.bitCount(a.intValue()) == Integer.bitCount(b.intValue()) ?
                        a.compareTo(b) :
                        Integer.bitCount(a.intValue()) - Integer.bitCount(b.intValue()));

        //Convert it back to primitive array
        return Arrays.stream(boxedArray).mapToInt(Integer::intValue).toArray();
    }
}
