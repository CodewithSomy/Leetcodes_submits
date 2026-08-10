class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries == null || timeSeries.length == 0) return 0;
        int tem=0;
        for (int i=0;i<timeSeries.length-1;i++) {
            tem += Math.min(timeSeries[i+1]-timeSeries[i],duration);
        }
        return tem+duration;          
    }
}