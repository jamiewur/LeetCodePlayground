package Algorithm.Easy;

public class MinimumTimeVisitingAllPoints {

    public int minTimeToVisitAllPoints(int[][] points) {
        int t = 0;
        for (int i = 1; i < points.length; ++i) {

            int[] p0 = points[i - 1];
            int[] p1 = points[i];

            int x = Math.abs(p1[0] - p0[0]);
            int y = Math.abs(p1[1] - p0[1]);
            int d;
            if (y > x) {
                d = y;
            } else {
                d = x;
            }
            t += d;
        }
        return t;
    }
}
