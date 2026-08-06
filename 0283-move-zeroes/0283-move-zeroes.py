class Solution(object):
    def moveZeroes(self, nums):
        insert_pos = 0
        for n in nums:
            if n != 0:
                nums[insert_pos] = n
                insert_pos += 1
        for i in range(insert_pos, len(nums)):
            nums[i] = 0