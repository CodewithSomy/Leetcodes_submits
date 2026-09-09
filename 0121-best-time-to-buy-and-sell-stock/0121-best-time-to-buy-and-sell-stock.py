class Solution(object):
    def maxProfit(self, prices):
        if not prices:
            return 0
        n=len(prices)
        min=float('inf')
        max_profit=0
        for price in prices:
            if price < min:
                min = price
            else:
                max_profit = max(max_profit, price - min)
        return max_profit