class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int p = 0;
        int q = 0;
        int res = 0;

        while (q < s.length()) {
            char c = s.charAt(q);

            while (set.contains(c)) {
                set.remove(s.charAt(p));
                p++;
            }

            if (!set.contains(c)) {
                set.add(c);
                q++;
                res = Math.max(res, q - p); // 0p 1 3q [,) 
            }
        }

        return res;
    }
}
