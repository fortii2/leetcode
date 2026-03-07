class Solution {
    public boolean isPalindrome(String s) {
        int p = 0;
        int q = s.length() - 1;

        while (p < q) {
            while (p < q && !Character.isLetterOrDigit(s.charAt(p)))
                p++;
            while (p < q && !Character.isLetterOrDigit(s.charAt(q)))
                q--;

            char lowerP = s.charAt(p);
            if (lowerP >= 'A' && lowerP <= 'Z') {
                lowerP = (char) (lowerP - ('A' - 'a'));
            }

            char lowerQ = s.charAt(q);
            if (lowerQ >= 'A' && lowerQ <= 'Z') {
                lowerQ = (char) (lowerQ - ('A' - 'a'));
            }

            if (lowerP != lowerQ)
                return false;

            p++;
            q--;
        }

        return true;
    }
}
