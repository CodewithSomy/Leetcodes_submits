class Solution(object):
    def maxValidPairSum(self, nums, k):
        max_pair_sum = -float('inf')
        max_i_val = -float('inf')

        for j in range(k, len(nums)):
            max_i_val = max(max_i_val, nums[j - k])
            max_pair_sum = max(max_pair_sum, max_i_val + nums[j])

        return max_pair_sum
