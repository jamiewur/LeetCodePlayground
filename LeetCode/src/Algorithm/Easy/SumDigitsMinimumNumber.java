package Algorithm.Easy;

public class SumDigitsMinimumNumber {
    public int sumOfDigits(int[] A) {
        int small = 99;
        int a;
        for(int i=0;i<A.length;i++){
            if(A[i]<small) small=A[i];
        }
        int S = small/10 + small%10;
        return a = S%2 == 0? 1: 0;
    }
}
