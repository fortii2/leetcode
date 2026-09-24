class Solution:
    def containsDuplicate(self, nums: list[int]) -> bool:
        sety = set()

        for num in nums:
            if num in sety:
                return True
            sety.add(num)
        
        return False
