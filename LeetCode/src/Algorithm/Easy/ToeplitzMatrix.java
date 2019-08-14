package Algorithm.Easy;

public class ToeplitzMatrix {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int R = matrix.length;
        int C = matrix[0].length;
        for(int i=0;i<R-1;i++){
            int sum1 = 0;
            int sum2 = 0;
            for(int j=0;j<C-1;j++){
                sum1 += matrix[i][j];
                sum2 += matrix[i+1][j+1];
            }
            if(sum1 != sum2) return false;
        }
        return true;
    }
}
