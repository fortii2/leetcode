class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maximum = Integer.MIN_VALUE;

        while (left < right) {
            int w = right - left;
            int h = Math.min(height[left], height[right]);
            int field = w * h;
            maximum = Math.max(maximum, field);

            if (height[left] < height[right]) {
                int current = left;
                while (current < height.length && height[current] <= height[left]) current++;
                left = current;
            } else {
                int current = right;
                while (current >= 0 && height[current] <= height[right]) current--;
                right = current;
            }
        }

        return maximum;
    }
}
