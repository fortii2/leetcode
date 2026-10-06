class Solution:
    def twoSum(self, numbers: list[int], target: int) -> list[int]:
        mapy = {}

        for i, num in enumerate(numbers):
            wanted = target - num

            if wanted in mapy:
                return [mapy[wanted] + 1, i + 1]

            mapy[num] = i

        return []

