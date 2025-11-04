class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        greatest = candies[0]
        for i in range(len(candies)):
            greatest = max(candies[i], greatest)

        result = []
        for i in range(len(candies)):
            if candies[i] + extraCandies >= greatest:
                result.append(True)
            else:
                result.append(False)
        
        return result
