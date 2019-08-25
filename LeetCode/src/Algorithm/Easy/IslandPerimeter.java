package Algorithm.Easy;

public class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0,r,c;
        for(r=0;r<grid.length;r++){
            for(c=0;c<grid[0].length;c++){
                if(grid[r][c]==1){
                    //up
                    if (r==0 || (grid[r-1][c]!=1)) perimeter++;
                    //down
                    if (r==grid.length-1 || (grid[r+1][c]!=1)) perimeter++;
                    //left
                    if (c==0 || (grid[r][c-1]!=1)) perimeter++;
                    //right
                    if (c==grid[0].length-1 || (grid[r][c+1]!=1)) perimeter++;
                }
            }
        }
        return perimeter;
    }
}
