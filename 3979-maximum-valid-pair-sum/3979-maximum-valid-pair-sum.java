public class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int maxPairSum = Integer.MIN_VALUE;
        int maxIVal = Integer.MIN_VALUE;

        for (int j = k; j < nums.length; j++) {
            maxIVal = Math.max(maxIVal, nums[j - k]);
            maxPairSum = Math.max(maxPairSum, maxIVal + nums[j]);
        }

        return maxPairSum;
    }
}