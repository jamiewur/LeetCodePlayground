package Algorithm.Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class HeightChecker {
    public int heightChecker(int[] heights) {
        int step = 0;
        int[] a = new int[heights.length];

        for (int j=0;j<heights.length;j++) a[j] = heights[j];

        Arrays.sort(heights);

        for (int i = 0; i < heights.length; i++) {
            if (a[i] != heights[i]) step++;
        }
        return step;
    }
}
