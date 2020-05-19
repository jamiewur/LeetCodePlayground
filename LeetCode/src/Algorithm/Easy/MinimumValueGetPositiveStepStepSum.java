package Algorithm.Easy;

public class MinimumValueGetPositiveStepStepSum {
    public int minStartValue(int[] nums) {
        for (int i = 1; i < 101; i++ ) {
            int sum = i;
            boolean ok = true;
            outer: for (int j : nums) {
                sum += j;
                if (sum < 1) {
                    ok = false;
                    break outer;
                }
            }
            if (ok) return i;
        }
        return 0;
    }
}
