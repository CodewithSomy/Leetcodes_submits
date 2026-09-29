class Solution {
    public int maxArea(int[] height) {
        int p1=0,p2=height.length-1,mAxrea=0;
        while (p1<p2) {
            int h1=height[p1];
            int h2=height[p2];
            mAxrea = Math.max(Math.min(h1, h2)*(p2-p1), mAxrea);
            if (h1>h2){
                while (p1<p2 && height[p2]<=h2)p2--;
            } else {
                while (p1<p2 && height[p1]<=h1)p1++;
            }
        }
        return mAxrea;
    }
}
