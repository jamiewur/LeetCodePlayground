package Algorithm.Easy;

public class FindDistanceValueBetweenTwoArrays {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int res = 0;
        for (int r1: arr1) {
            case1: for (int r2: arr2) {
                if ( Math.abs( r1 - r2 ) <= d) {
                    res++;
                    break case1;
                }
            }
        }
        return arr1.length - res;
    }
}
