class Solution(object):
    def shuffle(self, nums, n):
        numbers = []
        for x,y in zip(nums[:n],nums[n:]):       
            numbers.extend([x,y])
        return numbers  