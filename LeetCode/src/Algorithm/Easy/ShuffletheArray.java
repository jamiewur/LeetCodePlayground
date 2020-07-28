package Algorithm.Easy;

public class ShuffletheArray {
    public int[] shuffle(int[] nums, int n) {
        if (nums == null) return null;
        int[] res = new int[n*2];

        for (int i = 0; i < n ; ++i) {
            res[2*i] = nums[i];
            res[2*i+1] = nums[i+n];
        }
        return res;
    }
}
