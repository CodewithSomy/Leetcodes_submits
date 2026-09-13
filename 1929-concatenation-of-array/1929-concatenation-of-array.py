class Solution(object):
    def getConcatenation(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        ans=[]
        return nums+nums
        for i in range(2):
            for i in nums:
                ans.append(i)
        