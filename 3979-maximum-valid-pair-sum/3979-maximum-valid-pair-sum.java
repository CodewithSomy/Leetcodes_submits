public class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int maxSum = Integer.MIN_VALUE;
        int maxI = Integer.MIN_VALUE;

        for (int j = k; j < nums.length; j++) {
            maxI = Math.max(maxI, nums[j - k]);
            maxSum = Math.max(maxSum, maxI + nums[j]);
        }

        return maxSum;
    }
}