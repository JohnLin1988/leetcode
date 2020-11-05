//给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。 
//
// 
//
// 示例： 
//
// 输入："Let's take LeetCode contest"
//输出："s'teL ekat edoCteeL tsetnoc"
// 
//
// 
//
// 提示： 
//
// 
// 在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。 
// 
// Related Topics 字符串 
// 👍 253 👎 0

package com.cute.leetcode.editor.cn;

public class ReverseWordsInAStringIii {
    public static void main(String[] args) {
        Solution solution = new ReverseWordsInAStringIii().new Solution();
        System.out.println(solution.reverseWords(" s'teL    ekat edoCteeL tsetnoc "));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String reverseWords(String s) {
            char[] ch = s.toCharArray();
            int left = 0;
            int right = 0;
            int index = 0;
            while (left < ch.length) {
                index = s.indexOf(' ', left);

                if (index == -1) {
                    right = ch.length - 1;
                }else {
                    right = index-1;
                }

                while (left < right) {
                    char temp = ch[left];
                    ch[left] = ch[right];
                    ch[right] = temp;
                    left++;
                    right--;
                }

                if (index == -1) {
                    return  new String(ch);
                }else {
                    left = index + 1;
                }
            }
            return new String(ch);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}