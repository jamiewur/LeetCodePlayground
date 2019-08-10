package Algorithm.Easy;

public class SumEvenNumbersAfterQueries {

    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int n = A.length,i;
        int [] B = new int[n];
        for(i=0;i<n;i++){
            int sum = 0;
            A[queries[i][1]] += queries[i][0];
            for(int a:A){
                if(a%2==0){
                    sum+=a;
                }
            }
            B[i] = sum;
        }
        return B;
    }
}
