class Solution {
    public String longestPalindrome(String s) {
        int start = 0;
        int end = 0;

        // bab
        for (int i = 0; i < s.length(); i++) {
            int L = i;
            int R = i;

            while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
                if (R - L > end - start) {
                    end = R;
                    start = L;
                }
                L--;
                R++;
            }
        }

        // cbbd
        for (int i = 1; i < s.length(); i++) {
            int L = i - 1;
            int R = i;

            while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
                if (R - L > end - start) {
                    end = R;
                    start = L;
                }
                L--;
                R++;

            }
        }

        return s.substring(start, end + 1);
    }
}
