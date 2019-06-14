package Algorithm.Easy;

/**
 * Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.
 *Input: [-4,-1,0,3,10]
 *Output: [0,1,9,16,100]
 *Input: [-7,-3,2,3,11]
 *Output: [4,9,9,49,121]
 */
public class SquaresSortedArray {

    public int[] sortedSquares(int[] A) {

        int [] B = new int[A.length];
        for(int i=0; i<A.length; i++){
            B[i] = A[i]*A[i];
        }

        for(int i=1; i<B.length;i++){
            for(int j=i-1; j>=0;j--){
                if(B[j+1]<B[j]){
                    int current = B[j];
                    B[j] = B[j+1];
                    B[j+1] = current;
                }
                else continue;
            }
        }
        return B;
    }
}
