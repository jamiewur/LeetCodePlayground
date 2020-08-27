package Algorithm.Easy;

public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc] != newColor) fill(image, sr, sc, image[sr][sc], newColor);
        return image;
    }
    public void fill(int[][]ar, int sr, int sc, int cen, int newColor) {
        if(sr < 0 || sc < 0 || sr >= ar.length || sc >= ar[0].length || ar[sr][sc] != cen) return;
        ar[sr][sc] = newColor;
        fill(ar, sr-1,sc, cen,newColor);
        fill(ar, sr,sc-1, cen,newColor);
        fill(ar, sr+1,sc, cen,newColor);
        fill(ar, sr,sc+1, cen,newColor);
    }
}
