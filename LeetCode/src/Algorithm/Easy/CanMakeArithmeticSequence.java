package Algorithm.Easy;

import java.util.Arrays;

public class CanMakeArithmeticSequence {
    public boolean canMakeArithmeticProgression(int[] arr) {
        boolean res = false;
        double sum1 = 0, sum2 = 0;
        Arrays.sort(arr);
        for (int a: arr) sum1 += a;
        sum2 = arr.length * (arr[0] + arr[arr.length - 1]) / 2.0;

        return sum1 == sum2;
    }
}
