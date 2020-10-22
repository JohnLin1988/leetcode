//给你两个二进制字符串，返回它们的和（用二进制表示）。 
//
// 输入为 非空 字符串且只包含数字 1 和 0。 
//
// 
//
// 示例 1: 
//
// 输入: a = "11", b = "1"
//输出: "100" 
//
// 示例 2: 
//
// 输入: a = "1010", b = "1011"
//输出: "10101" 
//
// 
//
// 提示： 
//
// 
// 每个字符串仅由字符 '0' 或 '1' 组成。 
// 1 <= a.length, b.length <= 10^4 
// 字符串如果不是 "0" ，就都不含前导零。 
// 
// Related Topics 数学 字符串 
// 👍 500 👎 0

package com.cute.leetcode.editor.cn;

public class AddBinary {
    public static void main(String[] args) {
        Solution solution = new AddBinary().new Solution();
        System.out.println(solution.addBinary("1010", "1011"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String addBinary(String a, String b) {
            char[] charsA = a.toCharArray();
            char[] charsB = b.toCharArray();
            int maxLen = a.length() > b.length() ? a.length() : b.length();
            String resultStr = "";

            //进位标志位
            int flag = 0;
            for (int i = 0; i < maxLen; i++) {
                int aChar = 0;
                int bChar = 0;
                if (i < a.length()) {
                    aChar = charsA[a.length()-1-i] - 48;
                }

                if (i < b.length()) {
                    bChar = charsB[b.length()-1-i] - 48;
                }
//                System.out.println("aChar>>"+aChar+"  bChar"+bChar+"  flag"+flag);
                int sum = aChar + bChar + flag;
                if (sum >= 2) {
                    flag = 1;
                } else {
                    flag = 0;
                }
                resultStr = sum % 2 + resultStr;
            }
            //如果最后一位进位是1，则拼接
            if (flag == 1) {
                resultStr = 1 + resultStr;
            }
            return resultStr;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}