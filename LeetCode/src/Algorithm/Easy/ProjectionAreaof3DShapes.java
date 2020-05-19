package Algorithm.Easy;

public class ProjectionAreaof3DShapes {
    public int projectionArea(int[][] grid) {
        int z = 0;
        int x = 0;
        int y = 0;

        // z
        for (int[] outZ: grid) {
            for (int inZ: outZ) {
                if ( inZ != 0 ) z++;
            }
        }

        // x
        for (int[] outX: grid) {
            int max = Integer.MIN_VALUE;
            for (int inX: outX) {
                if (inX > max) max = inX;
            }
            x += max;
        }

        // y
        for (int yi = 0; yi < grid[0].length; yi++) {
            int max = Integer.MIN_VALUE;
            for (int xi = 0; xi < grid.length; xi++) {
                if (grid[xi][yi] > max) max = grid[xi][yi];
            }
            y += max;
        }

        return z+y+x;
    }
}
