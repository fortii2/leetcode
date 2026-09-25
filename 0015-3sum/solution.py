class Solution:
    def threeSum(self, nums: list[int]) -> list[list[int]]:
        # deduplicate, return num
        nums.sort()
        res = []

        for i in range(len(nums)):
            if nums[i] > 0:
                break

            if i > 0 and nums[i] == nums[i - 1]:
                continue

            p, q = i + 1, len(nums) - 1

            while p < q:
                if nums[i] + nums[p] + nums[q] < 0:
                    p += 1
                elif nums[i] + nums[p] + nums[q] > 0:
                    q -= 1
                else:
                    res.append([nums[i], nums[p], nums[q]])
                    p += 1
                    q -= 1

                    while p < q and nums[p] == nums[p - 1]:
                        p += 1

                    while p < q and nums[q + 1] == nums[q]:
                        q -= 1

        return res

