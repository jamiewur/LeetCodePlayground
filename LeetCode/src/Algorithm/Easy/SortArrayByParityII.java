package Algorithm.Easy;

public class SortArrayByParityII {
    public int[] sortArrayByParityII(int[] A) {
        for (int c = 0; c < A.length; c++) {
            if (c % 2 != A[c] % 2) {
                main: for (int p = c + 1; p < A.length; p++) {
                    if (p % 2 != A[p] % 2 )
                    {
                        
                        if ( A[c] % 2 != A[p] % 2)
                        {
                            int swap = A[c];
                            A[c] = A[p];
                            A[p] = swap;

                            break main;
                        }
                    }
                }
            }
        }
        return A;
    }
}
