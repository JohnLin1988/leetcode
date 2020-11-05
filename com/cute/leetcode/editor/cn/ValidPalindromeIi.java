//给定一个非空字符串 s，最多删除一个字符。判断是否能成为回文字符串。 
//
// 示例 1: 
//
// 
//输入: "aba"
//输出: True
// 
//
// 示例 2: 
//
// 
//输入: "abca"
//输出: True
//解释: 你可以删除c字符。
// 
//
// 注意: 
//
// 
// 字符串只包含从 a-z 的小写字母。字符串的最大长度是50000。 
// 
// Related Topics 字符串 
// 👍 281 👎 0

package com.cute.leetcode.editor.cn;

public class ValidPalindromeIi {
    public static void main(String[] args) {
        Solution solution = new ValidPalindromeIi().new Solution();
        System.out.println(solution.validPalindrome("abcca"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean validPalindrome(String s) {
            char[] ch = s.toCharArray();
            int left = 0;
            int right = s.length() - 1;
            while (left < right) {
                if (ch[left] == ch[right]) {
                    left++;
                    right--;
                } else {
                    if (validPalindrome(ch,left+1,right) || validPalindrome(ch,left,right-1) ){
                        return true;
                    }else{
                        return false;
                    }
                }
            }
            return true;
        }

        private boolean validPalindrome(char[] ch, int left, int right) {
            while (left < right) {
                if (ch[left] == ch[right]) {
                    left++;
                    right--;
                }else {
                    return false;
                }
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}