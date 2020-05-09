package Algorithm.Easy;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumbersMatrix {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;
        int[] minR = new int[row];
        int[] maxC = new int[col];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Find the min number in each row
        for (int i = 0; i < row; i++) {
            for (int c = 0; c < col; c++) {
                if (matrix[i][c] < min) min = matrix[i][c];
            }
            minR[i] = min;
            min = Integer.MAX_VALUE;
        }

        // Find the max number in each col
        for (int c = 0; c < col; c++ ){
            for (int r = 0; r < row; r++) {
                if (matrix[r][c] > max ) max = matrix[r][c];
            }
            maxC[c] = max;
            max = Integer.MIN_VALUE;
        }

        // Find the same number
        for (int i: minR) {
            for (int a: maxC) {
                if ( i == a ) {
                    result.add(i);
                    return result;
                }
            }
        }

        return result;
    }
}
