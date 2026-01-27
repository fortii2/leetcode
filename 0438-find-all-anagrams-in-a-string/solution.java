class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();

        int[] target = new int[26];
        for (char c : p.toCharArray()) {
            target[c - 'a']++;
        }

        char[] arr = s.toCharArray();
        int[] windows = new int[26];
        int left = 0, right = 0;

        while (right < arr.length) {
            if (right - left >= p.length()) {
                windows[arr[left++] - 'a']--;
            }

            windows[arr[right++] - 'a']++;

            if (Arrays.equals(windows, target)) {
                res.add(left);
            }
        }

        return res;
    }
}
