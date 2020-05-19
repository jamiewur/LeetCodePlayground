package Algorithm.Easy;

public class FindLuckyIntegerinArray {
    public int findLucky(int[] arr) {
        int res = -1;
        int [] a = new int[500];

        for (int i: arr) a[i-1]++;

        for (int i = 0; i < 500; i++) {
            if (a[i] > 0) {
                if (a[i] == i+1) res = a[i];
            }
        }
        return res;
    }
}
