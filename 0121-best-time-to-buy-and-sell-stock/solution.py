import sys

class Solution:
    def maxProfit(self, prices: list[int]) -> int:
        min_price = sys.maxsize
        max_profit = - sys.maxsize - 1

        for p in prices:
            min_price = min(min_price, p)
            today_earn = p - min_price
            max_profit = max(max_profit, today_earn)
        
        return max_profit

