import heapq


class Solution:
    def topKFrequent(self, nums: list[int], k: int) -> list[int]:
        mapy = {}  # num, freq

        for num in nums:
            mapy[num] = mapy.get(num, 0) + 1

        pq = []

        for num, freq in mapy.items():
            heapq.heappush(pq, (freq, num))

            if len(pq) > k:
                heapq.heappop(pq)

        res = []
        for freq, num in pq:
            res.append(num)

        return res

