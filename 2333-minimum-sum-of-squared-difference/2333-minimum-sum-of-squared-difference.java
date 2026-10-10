class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        int[] diff = new int[n];
        int maxDiff = 0;
        
        for (int i = 0; i < n; i++) {
            diff[i] = Math.abs(nums1[i] - nums2[i]);
            maxDiff = Math.max(maxDiff, diff[i]);
        }
        
        long totalK = (long) k1 + k2;
        
        int low = 0;
        int high = maxDiff;
        int optiMax = 0;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (canReduceTo(diff, mid, totalK)) {
                optiMax = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        for (int i = 0; i < n; i++) {
            if (diff[i] > optiMax) {
                totalK -= (diff[i] - optiMax);
                diff[i] = optiMax;
            }
        }
        
        for (int i = 0; i < n && totalK > 0; i++) {
            if (diff[i] == optiMax && diff[i] > 0) {
                diff[i]--;
                totalK--;
            }
        }
        
        long sumOfSquares = 0;
        for (int i = 0; i < n; i++) {
            sumOfSquares += (long) diff[i] * diff[i];
        }
        
        return sumOfSquares;
    }
    
    private boolean canReduceTo(int[] diff, int tMax, long k) {
        long opsReq = 0;
        for (int d : diff) {
            if (d > tMax) {
                opsReq += (d - tMax);
            }
        }
        return opsReq <= k;
    }
}
