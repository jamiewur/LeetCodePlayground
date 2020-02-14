package Algorithm.Easy;

public class CellswithOddValuesMatrix {
    public int oddCells(int n, int m, int[][] indices) {
        int oddn = 0;

        // Establish a matrix model
        int [][] ma = new int[n][m];

        // Increment corresponding row and column
        for (int[] i: indices) {
            int r = i[0];
            int c = i[1];

            for (int y = 0; y < m; y++ ){
                ma[r][y]++;
            }
            for (int x = 0; x < n; x++ ){
                ma[x][c]++;
            }
        }

        // Cal the result
        for(int mr=0; mr < n; mr++){
            for(int mc=0; mc < m; mc++){
                if (ma[mr][mc] % 2 != 0) oddn++;
            }
        }
        return oddn;
    }
}
