class Solution {
    public int findMin(int[] nums) {
        // binary search
        // if mid > right, smallet must in right

        int left = 0;
        int right = nums.length - 1;

        // defination: [,]
        // 4 5 6 7 8 1 2 3
        //      mid
        while (left < right) {
            int mid = (left + right) / 2;

            if (nums[mid] > nums[right]) { // smallet at right
                left = mid + 1;
            } else { // smallest at left(mid)
                right = mid;
            }
        }

        return nums[left];
    }
}
