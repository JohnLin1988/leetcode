//给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。 
//
// 说明：本题中，我们将空字符串定义为有效的回文串。 
//
// 示例 1: 
//
// 输入: "A man, a plan, a canal: Panama"
//输出: true
// 
//
// 示例 2: 
//
// 输入: "race a car"
//输出: false
// 
// Related Topics 双指针 字符串 
// 👍 284 👎 0

package com.cute.leetcode.editor.cn;

public class ValidPalindrome {
    public static void main(String[] args) {
        Solution solution = new ValidPalindrome().new Solution();
        System.out.println(solution.isPalindrome(".   "));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isPalindrome(String s) {
            int left = 0;
            int right = s.length() - 1;
            while (left <= right) {
                char leftChar = s.charAt(left);
                char rightChar = s.charAt(right);

                if (!charIsLetterOrNumer(leftChar)) {
                    left++;
                    continue;
                }
                if (!charIsLetterOrNumer(rightChar)) {
                    right--;
                    continue;
                }
                if (Character.toUpperCase(leftChar) != Character.toUpperCase(rightChar)) {
                    return false;
                } else {
                    left++;
                    right--;
                }
            }
            return true;
        }

        private boolean charIsLetterOrNumer(char c) {
            return ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'));
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}