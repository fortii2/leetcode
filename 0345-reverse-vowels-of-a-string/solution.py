class Solution:
    def reverseVowels(self, s: str) -> str:
        vowels = set("aeiouAEIOU")
        s = list(s)
        p, q = 0, len(s) - 1

        while p < q:
            if s[p] in vowels and s[q] in vowels:
                s[p], s[q] = s[q], s[p]
                p += 1
                q -= 1

            if s[p] not in vowels:
                p += 1
            if s[q] not in vowels:
                q -= 1

        return ''.join(s)
            

