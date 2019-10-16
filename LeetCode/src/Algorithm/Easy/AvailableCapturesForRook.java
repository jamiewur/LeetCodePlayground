package Algorithm.Easy;

public class AvailableCapturesForRook {
    public int numRookCaptures(char[][] board) {
        int count = 0;
        int x,y;
        // find the rock
        for(int i=0;i<8;i++){
            for (int j=0; j<8;j++){
                if(board[i][j] == 'R') {
                    // left
                    for(int k=i-1;k>=0;k--){
                        if(board[k][j] == 'B') break;
                        else if( board[k][j] == 'p') {
                            count++;
                            break;
                        }
                    }
                    // right
                    for(int m=i+1;m<=7;m++){
                        if(board[m][j] == 'B') break;
                        else if( board[m][j] == 'p') {
                            count++;
                            break;
                        }
                    }

                    // up
                    for(int n=j-1;n>=0;n--){
                        if(board[i][n] == 'B') break;
                        else if( board[i][n] == 'p') {
                            count++;
                            break;
                        }
                    }


                    // down
                    for(int o=j+1;o<=7;o++){
                        if(board[i][o] == 'B') break;
                        else if( board[i][o] == 'p') {
                            count++;
                            break;
                        }
                    }

                    break;
                }
            }
        }
        return count;
    }
}
