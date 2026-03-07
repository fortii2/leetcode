class Solution {
    public boolean isAnagram(String s, String t) {
        // sort & compare

        if (s.length() != t.length()) {
            return false;
        }

        int[] frequency = new int[26];

        for (char c : s.toCharArray()) {
            frequency[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            int idx = c - 'a';
            frequency[idx]--;

            if (frequency[idx] < 0) {
                return false;
            }
        }

        return true;
    }
}
