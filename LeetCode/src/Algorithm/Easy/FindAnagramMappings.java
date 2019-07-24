package Algorithm.Easy;

public class FindAnagramMappings {
    public int[] anagramMappings(int[] A, int[] B) {

        int n = A.length;
        int[] C = new int[n];

        for(int i=0; i<n;++i){
            for(int j=0;j<n;++j){
                if(A[i]==B[j]) C[i]=j;
            }
        }

        return C;
    }
}
