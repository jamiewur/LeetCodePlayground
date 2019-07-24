package Algorithm.Easy;

public class FixedPoint {
    public int fixedPoint(int[] A) {
        int n = A.length;
        int result = -1;

        for(int i=0;i<n;i++){
            if(A[i]==i) result = i;
        }
        return result;
    }
}
