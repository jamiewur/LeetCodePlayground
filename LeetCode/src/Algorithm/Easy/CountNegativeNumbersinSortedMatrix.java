package Algorithm.Easy;

public class CountNegativeNumbersinSortedMatrix {
    public int countNegatives(int[][] grid) {
        int nn = 0;

        for (int [] i: grid) {
            for ( int c: i){
                if (c < 0) nn++;
            }
        }

        return nn;
    }
}
