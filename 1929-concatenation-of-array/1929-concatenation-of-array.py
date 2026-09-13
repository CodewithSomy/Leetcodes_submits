class Solution(object):
    def getConcatenation(self, nums):
        ans=[nums[x] for x in range(len(nums))]
        ans.extend(nums[x] for x in range(len(nums)))
        return ans
        