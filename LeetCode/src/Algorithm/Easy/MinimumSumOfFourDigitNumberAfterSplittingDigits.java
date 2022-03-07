package Algorithm.Easy;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MinimumSumOfFourDigitNumberAfterSplittingDigits {
    public int minimumSum(int num) {
        List<Integer> n = new LinkedList<>();

        for (int i = num; i > 0 ; i /= 10) {
            n.add(i % 10);
        }

        Collections.sort(n);

        return (n.get(0) * 10 + n.get(2)) + (n.get(1) * 10 + n.get(3));
    }
}
