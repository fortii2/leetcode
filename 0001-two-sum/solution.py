class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        previous = {}

        for i in range(len(nums)):
            diff = target - nums[i]

            if diff in previous:
                return [previous.get(diff), i]
            
            previous[nums[i]] = i
