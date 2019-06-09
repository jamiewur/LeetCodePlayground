package Algorithm.Easy;

public class FlippingImage {

    public int[][] flipAndInvertImage(int[][] A) {

        int[][] converedArray = A;
        int arrayLength = A[0].length;

        // swap
        if(arrayLength%2==0){
            int swaptimes = arrayLength/2;
            for(int i=0;i<A[0].length;i++){
                for(int j=0; j<swaptimes; j++){
                    int c = A[i][j];
                    A[i][j] = A[i][arrayLength-1-j] ;
                    A[i][arrayLength-1-j] = c;
                }
            }
        }
        else {
            int swaptimes = (arrayLength-1)/2;
            for(int i=0;i<A[0].length;i++){
                for(int j=0; j<swaptimes; j++){
                    int k = A[i][j];
                    A[i][j] = A[i][arrayLength-1-j];
                    A[i][arrayLength-1-j] = k;
                }
            }
        }
        for(int i=0;i<A[0].length;i++) {
            for (int j= 0; j<A.length;j++)
                if(A[i][j] == 0){
                    A[i][j] =1;
                }
                else if(A[i][j] == 1) A[i][j] = 0;
            }


        return converedArray;
        }
    }
