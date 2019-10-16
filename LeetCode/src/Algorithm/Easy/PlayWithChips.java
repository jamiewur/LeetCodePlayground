package Algorithm.Easy;

public class PlayWithChips {
    public int minCostToMoveChips(int[] chips) {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<chips.length;i++){
            int pointer = chips[i];
            int n = 0;
            for(int j=0;j<chips.length;j++){
                int current = chips[j];
                if(Math.abs(pointer-current)%2==1) n++;
            }
            if(n<min) min = n;
        }
        return min;
    }
}
