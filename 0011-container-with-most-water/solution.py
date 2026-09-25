class Solution:
    def maxArea(self, height: list[int]) -> int:
        p, q, res = 0, len(height) - 1, 0

        while p < q:
            h = min(height[p], height[q])
            w = q - p
            res = max(res, h * w)

            if height[p] < height[q]:
                p += 1
            else:
                q -= 1

        return res

