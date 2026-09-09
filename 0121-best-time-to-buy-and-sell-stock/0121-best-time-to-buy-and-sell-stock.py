class Solution(object):
    def maxProfit(self, prices):
        if not prices:
           return 0
        profit = 0
        max = min = prices[0]
        for price in prices:
            if price < min:
                max = min = price
            elif max < price:
                 max = price
                 temp = max - min
                 if profit < temp:
                    profit = temp
        return profit