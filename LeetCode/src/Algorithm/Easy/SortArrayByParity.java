package Algorithm.Easy;

public class SortArrayByParity {

    public int[] sortArrayByParity(int[] A) {

        int arrayLength = A.length;

        for(int frontPointer = 0; frontPointer < arrayLength; frontPointer++) {
            if (A[frontPointer] % 2 != 0) {
                for (int endPointer = arrayLength - 1; endPointer >frontPointer; endPointer--){
                    if(A[endPointer]%2 == 0) {
                        int a = A[frontPointer];
                        A[frontPointer] = A[endPointer];
                        A[endPointer] = a;
                        continue;
                    }
                }
            }
        }

        return A;
    }
}
