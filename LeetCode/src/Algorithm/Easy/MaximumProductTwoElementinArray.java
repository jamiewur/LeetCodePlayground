package Algorithm.Easy;

public class MaximumProductTwoElementinArray {
    public int maxProduct(int[] nums) {
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length -1; ++i) {
            for (int j = i + 1 ; j < nums.length; ++j) {
                int c = (nums[i]-1) * (nums[j]-1);
                if (c > res) res = c;
            }
        }
        return res;
    }
}
