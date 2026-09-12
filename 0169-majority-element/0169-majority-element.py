class Solution(object):
    def majorityElement(sums,nums):
        found={}
        for item in nums:
            if not item in found:
                  found[item]=1
                  continue
            found[item]+=1
        max_value = max(found.values())
        return [key for key, value in found.items() if value == max_value][0]