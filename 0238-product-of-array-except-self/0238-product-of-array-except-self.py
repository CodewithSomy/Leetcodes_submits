class Solution:
    def productExceptSelf(self, nums):
        n=len(nums)
        ret=[1]*n
        lft_prod=1
        rit_prod=1
        for i in range(n):
            ret[i]*=lft_prod
            lft_prod*=nums[i]            
            ret[n-1-i]*=rit_prod
            rit_prod*=nums[n-1-i]
        return ret