package Algorithm.Easy;

public class HowManyNumbersSmallerThanCurrentNumber {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] a = new int[nums.length];
        int m = 0;

        for (int b : nums) {
            int o = 0;
            for ( int c: nums) {
                if( c != b) {
                    if (b > c) o++;
                }
            }
            a[m] = o;
            m++;
        }
        return a;
    }
}
