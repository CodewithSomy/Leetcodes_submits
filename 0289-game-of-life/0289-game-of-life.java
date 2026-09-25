import java.util.*;
class Solution {
    public void gameOfLife(int[][] board) {
        List<int[]> toflip=new ArrayList<>();
        for (int i=0;i<board.length;i++){
            for (int j=0;j<board[i].length;j++){
                int live=0;
                for (int r=-1;r<=1;r++) {
                    for (int c=-1;c<=1;c++) {        
                        if (r==0&&c==0)continue;
                        int nrow=i+r;
                        int ncol=j+c;
                        if (nrow>=0&&nrow<board.length&&ncol>=0&&ncol<board[i].length){
                            if (board[nrow][ncol]==1)live++;
                        }
                    }
                }
                if (board[i][j] == 1) {
                    if (live<2||live>3)toflip.add(new int[]{i, j});
                } else {
                    if (live==3)toflip.add(new int[]{i, j});                
                }
            }
        }
        for (int[] that: toflip) {
            board[that[0]][that[1]]^=1;
        }
    }
}