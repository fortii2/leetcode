class Solution:
    def longestConsecutive(self, nums: list[int]) -> int:
        sety = set(nums)
        res = 0

        for num in sety:
            if num - 1 in sety:
                continue

            tmp = num
            while tmp in sety:
                tmp = tmp + 1

            res = max(res, tmp - num)

        return res

