package Algorithm.Easy;

import java.util.ArrayList;
import java.util.List;

public class GreatestNumberCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = 0;

        for (int a : candies) {
            if (a > max) {
                max = a;
            }
        }

        for ( int a : candies) {
            int b = a + extraCandies;
            if ( b >= max ) result.add(true);
            else result.add(false);
        }

        return result;
    }
}
