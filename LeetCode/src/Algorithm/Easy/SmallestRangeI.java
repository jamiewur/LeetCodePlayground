package Algorithm.Easy;

public class SmallestRangeI {
    public int smallestRangeI(int[] A, int K) {
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int a: A){
            if(a>max) max = a;
        }
        for (int b:A){
            if(b<min) min =b;
        }
        return max-min <= 2*K ? 0 : (max-min-2*K);
    }
}
