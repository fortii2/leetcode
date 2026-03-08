class Solution {
    public int characterReplacement(String s, int k) {
        // slide window
        // hash table to save frequntcy
        // cur window size - max frequency <= k, fine
        // cur window size - max frequency > k, no, left ++;

        char[] str = s.toCharArray();
        int n = str.length;

        int[] arr = new int[26];
        int maxTime = Integer.MIN_VALUE;
        int res = 0;

        int left = 0;
        int right = 0;

        // [, ]

        while (left <= right && right < n) {
            arr[str[right] - 'A']++;
            maxTime = Math.max(arr[str[right] - 'A'], maxTime);
            right++;

            int windowSize = right - left;
            int needToReplace = windowSize - maxTime;

            if (needToReplace <= k) {
                res = Math.max(res, windowSize);
            } else {
                arr[str[left] - 'A']--;
                left++;
            }
        }

        return res;
    }
}
