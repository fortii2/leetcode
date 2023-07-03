class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        String arr = String.valueOf(x);

        for (int i = 0; i < arr.length() / 2; i++) {
            if (arr.charAt(i) != arr.charAt(arr.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
