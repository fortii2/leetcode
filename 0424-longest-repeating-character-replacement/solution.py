class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        # window_size - max_freq > k: shrink window

        p, q, mapy, max_freq, res = 0, 0, {}, 0, 0

        while p <= q and q < len(s):
            mapy[s[q]] = mapy.get(s[q], 0) + 1
            max_freq = max(max_freq, mapy[s[q]])
            q += 1

            while (q - p) - max_freq > k:
                mapy[s[p]] = mapy[s[p]] - 1
                p += 1

            res = max(res, q - p)

        return res

