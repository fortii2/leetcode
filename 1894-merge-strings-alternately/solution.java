class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len = Math.max(word1.length(), word2.length());
        int i = 0;
        StringBuilder sb = new StringBuilder();

        while (i < len) {
            if (i < word1.length()) {
                sb.append(word1.charAt(i));
            }

            if (i < word2.length()) {
                sb.append(word2.charAt(i));
            }

            i++;
        }

        return sb.toString();
    }
}

