class Solution {
    public String minWindow(String s, String t) {
        // use slide window
        // right to push until meet require
        // left to shorter this window until not meet
        // use arr to save current window frency

        String res = "";

        int[] target = new int[128];

        for (char c : t.toCharArray()) {
            target[c]++;
        }

        int keys = 0;
        for (int i = 0; i < target.length; i++) {
            if (target[i] != 0) {
                keys++;
            }
        }

        int left = 0;
        int right = 0;
        int[] inWindow = new int[128];

        char[] arr = s.toCharArray();

        int valid = 0;

        // [ , ]
        while (left <= right && right < s.length()) {
            char cur = arr[right];
            inWindow[cur]++;

            if (inWindow[cur] == target[cur]) {
                valid++;
            }

            right++;

            while (valid == keys && left <= right) {
                if (res.equals("") || right - left < res.length()) {
                    res = s.substring(left, right);
                }

                inWindow[arr[left]]--;

                if (inWindow[arr[left]] < target[arr[left]]) {
                    valid--;
                }

                left++;
            }
        }

        return res;
    }
}

