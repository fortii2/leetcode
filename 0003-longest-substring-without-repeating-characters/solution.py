class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        p, q = 0, 0
        mapy = {}
        res = 0

        while p <= q and q < len(s):
            mapy[s[q]] = mapy.get(s[q], 0) + 1

            if mapy[s[q]] > 1:
                while p < q:
                    mapy[s[p]] = mapy[s[p]] - 1
                    p += 1

                    if mapy[s[p - 1]] == 1:
                        break

            res = max(res, q - p + 1)
            q += 1

        return res

