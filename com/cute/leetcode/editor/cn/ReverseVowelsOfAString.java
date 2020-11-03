//编写一个函数，以字符串作为输入，反转该字符串中的元音字母。 
//
// 
//
// 示例 1： 
//
// 输入："hello"
//输出："holle"
// 
//
// 示例 2： 
//
// 输入："leetcode"
//输出："leotcede" 
//
// 
//
// 提示： 
//
// 
// 元音字母不包含字母 "y" 。 
// 
// Related Topics 双指针 字符串 
// 👍 120 👎 0

package com.cute.leetcode.editor.cn;

public class ReverseVowelsOfAString {
    public static void main(String[] args) {
        Solution solution = new ReverseVowelsOfAString().new Solution();
        System.out.println(solution.reverseVowels("hello"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String reverseVowels(String s) {
            int left = 0;
            int right = s.length() - 1;
            char temp = ' ';
            char[] charsArray = s.toCharArray();
            while (left < right) {
                if (!isType(charsArray[left])) {
                    left++;
                    continue;
                }

                if (!isType(charsArray[right])) {
                    right--;
                    continue;
                }
                temp = charsArray[left];
                charsArray[left] = charsArray[right];
                charsArray[right] = temp;
                left++;
                right--;
            }
            return String.valueOf(charsArray);

        }

        private boolean isType(char c) {
            c = Character.toLowerCase(c);
            return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}