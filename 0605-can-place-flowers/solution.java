//You have a long flowerbed in which some of the plots are planted, and some 
//are not. However, flowers cannot be planted in adjacent plots. 
//
// Given an integer array flowerbed containing 0's and 1's, where 0 means empty 
//and 1 means not empty, and an integer n, return true if n new flowers can be 
//planted in the flowerbed without violating the no-adjacent-flowers rule and false 
//otherwise. 
//
// 
// Example 1: 
// Input: flowerbed = [1,0,0,0,1], n = 1
//Output: true
// 
// Example 2: 
// Input: flowerbed = [1,0,0,0,1], n = 2
//Output: false
// 
// 
// Constraints: 
//
// 
// 1 <= flowerbed.length <= 2 * 10⁴ 
// flowerbed[i] is 0 or 1. 
// There are no two adjacent flowers in flowerbed. 
// 0 <= n <= flowerbed.length 
// 
//
// Related Topics Array Greedy 👍 7259 👎 1309


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 1 ||
                    (i - 1 >= 0 && flowerbed[i - 1] == 1) ||
                    (i + 1 < flowerbed.length && flowerbed[i + 1] == 1)) {
                continue;
            }

            flowerbed[i] = 1;
            n--;
        }

        if (n <= 0) {
            return true;
        }

        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

