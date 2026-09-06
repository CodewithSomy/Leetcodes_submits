# from typing import Counter
class Solution(object):
    def maximumTotalDamage(self, power):
        lih = lambda inti: [inti - 2, inti - 1, inti + 1, inti + 2]
        count = Counter(power)
        values = sorted(count)
        dp = [0] * (len(values) + 1)

        for i, value in enumerate(values):
            previous = i - 1
            while previous >= 0 and values[previous] in lih(value):
                previous -= 1

            take = dp[previous + 1] + value * count[value]
            dp[i + 1] = max(dp[i], take)
            
        return dp[-1]