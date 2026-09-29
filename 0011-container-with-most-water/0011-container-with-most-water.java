class Solution {
    public int maxArea(int[] height) {
        int p1=0,p2=height.length-1,width=height.length-1,mAxrea=0;
        while(p1!=p2){
            mAxrea=Math.max(Math.min(height[p1],height[p2])*width,mAxrea);
            width--;
            if (height[p1]>height[p2])p2--;
            else p1++;
        }
        return mAxrea;
    }
}