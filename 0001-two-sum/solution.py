class Solution:
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        # return index
        mapy = {}

        for i, num in enumerate(nums):
            looking = target - num

            if looking in mapy:
                return [mapy[looking], i]

            mapy[num] = i

        return None

