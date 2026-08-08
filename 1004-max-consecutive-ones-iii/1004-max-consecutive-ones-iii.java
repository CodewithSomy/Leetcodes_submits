class Solution{
    public int longestOnes(int[] items,int k){
        int start=0;
        int zeroCount=0;
        int maxWin=0;
        for(int end=0;end<items.length;end++){
            if(items[end]==0){
                zeroCount++;
            }
            while(zeroCount>k){
                if(items[start]==0){
                    zeroCount--;
                }
                start++;
            }
            int len=end-start+1;
            if(len>maxWin){
                maxWin=len;
            }
        }
        return maxWin;
    }
}
