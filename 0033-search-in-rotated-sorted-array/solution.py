class Solution:
    def search(self, nums: list[int], target: int) -> int:
        # [,]
        p, q = 0, len(nums) - 1

        while p <= q:
            mid = (p + q) // 2

            if nums[mid] == target:
                return mid

            if nums[p] <= nums[mid]:
                if nums[p] <= target < nums[mid]:
                    q = mid - 1
                else:
                    p = mid + 1
            else:
                if nums[mid] < target <= nums[q]:
                    p = mid + 1
                else:
                    q = mid - 1

        return -1

