class Solution(object):
    def shuffle(self, nums, n):
        for i in range(n):
            nums.insert(2*i+1,nums.pop(n+i))
        return nums        