class Solution(object):
    def maxSum(self, nums, k):
        MOD=10**9+7
        bitcount = [0] * 30
        for num in nums:
            for i in range(30):
                if num & (1 << i):
                    bitcount[i] += 1        
        
        ans = 0
        for _ in range(k):
            num = 0
            for i in range(30):
                if bitcount[i]>0:
                    num |= (1 << i)
                    bitcount[i] -= 1
            if num == 0:
                break
            ans=(ans+num*num)%MOD
            
        return ans