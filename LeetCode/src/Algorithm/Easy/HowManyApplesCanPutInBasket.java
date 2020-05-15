package Algorithm.Easy;

import java.util.Arrays;

public class HowManyApplesCanPutInBasket {
    public int maxNumberOfApples(int[] arr) {
        int res = 0;
        int sum = 0;

        if (arr.length == 0) return 0;

        Arrays.sort(arr);

        for (int i: arr) {
            if ((sum += i) <= 5000) res++;
        }

        return res;
    }
}
