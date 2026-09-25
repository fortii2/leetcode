class Solution:
    def isPalindrome(self, s: str) -> bool:
        p, q = 0, len(s) - 1

        while p < q:
            if not s[p].isalnum():
                p = p + 1
                continue
            
            if not s[q].isalnum():
                q = q - 1
                continue
            
            if s[p].lower() != s[q].lower():
                return False
            
            p += 1
            q -= 1
    
        return True
