class Solution {
    public int minQueenMoves(int[] source, int[] target) {
        int ret=2;
        ret-=(source[0]==target[0])?1:0;
        ret-=(source[1]==target[1])?1:0;
        if(ret==2){
            for (int i = 1; i<=8; i++) {
                for (int j=1;j<=8;j++) {
                    if ((i-j==source[0]-source[1] || i+j==source[0]+source[1] )) {
                        if (i==target[0] && j==target[1]) {
                            return 1;
                        }
                    }
                }
            }
        }
        return ret;
    }
}