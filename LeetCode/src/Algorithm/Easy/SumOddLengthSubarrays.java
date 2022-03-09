package Algorithm.Easy;

public class SumOddLengthSubarrays {
    public int sumOddLengthSubarrays(int[] arr) {
        int res = 0;
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            res += ((i + 1) * (len - i) + 1) / 2 * arr[i];
        }
        return res;
    }
}
