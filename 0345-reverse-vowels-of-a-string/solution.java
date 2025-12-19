//Given a string s, reverse only all the vowels in the string and return it. 
//
// The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both 
//lower and upper cases, more than once. 
//
// 
// Example 1: 
//
// 
// Input: s = "IceCreAm" 
// 
//
// Output: "AceCreIm" 
//
// Explanation: 
//
// The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes 
//"AceCreIm". 
//
// Example 2: 
//
// 
// Input: s = "leetcode" 
// 
//
// Output: "leotcede" 
//
// 
// Constraints: 
//
// 
// 1 <= s.length <= 3 * 10⁵ 
// s consist of printable ASCII characters. 
// 
//
// Related Topics Two Pointers String 👍 5211 👎 2848


import java.util.HashSet;
import java.util.Set;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();

        String vowels = "aeiouAEIOU";

        int p = 0;
        int q = s.length() - 1;

        while (p < q) {
            while (p < q && vowels.indexOf(arr[p]) == -1) p++;
            while (p < q && vowels.indexOf(arr[q]) == -1) q--;

            char temp = arr[p];
            arr[p] = arr[q];
            arr[q] = temp;

            p++;
            q--;
        }

        return new String(arr);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

