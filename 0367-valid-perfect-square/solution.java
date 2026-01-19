class Solution {
    public boolean isPerfectSquare(int num) {
        int left = 0;
        int right = num;

        while (left <= right) {
            int mid = (left + right) / 2;
            long t = (long) mid * mid;

            if (t < num) {
                left = mid + 1;
            } else if (t > num) {
                right = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
