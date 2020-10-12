//编写一个函数来查找字符串数组中的最长公共前缀。 
//
// 如果不存在公共前缀，返回空字符串 ""。 
//
// 示例 1: 
//
// 输入: ["flower","flow","flight"]
//输出: "fl"
// 
//
// 示例 2: 
//
// 输入: ["dog","racecar","car"]
//输出: ""
//解释: 输入不存在公共前缀。
// 
//
// 说明: 
//
// 所有输入只包含小写字母 a-z 。 
// Related Topics 字符串 
// 👍 1224 👎 0

package com.cute.leetcode.editor.cn;
public class LongestCommonPrefix {
    public static void main(String[] args) {
        Solution solution = new LongestCommonPrefix().new Solution();
        String[] strs = {"flower","flow","flight"};
        System.out.println(solution.longestCommonPrefix(strs));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String longestCommonPrefix(String[] strs) {

        StringBuffer buffer = new StringBuffer();

        if (strs.length == 0) {
            return "";
        }if (strs.length == 1) {
            return strs[0];
        }


        // 取出首个字符串
        String firstStr = strs[0];
        int firstStrlen = strs[0].length();

        for (int j = 0; j < firstStrlen; j++) {
            char ch = firstStr.charAt(j);

            // 遍历解析后的字符串数组,首个字符串按字符比较
            for (int i = 1; i < strs.length; i++) {
                String compareStr = strs[i];
                //如果有字符串长度小于第一个字符串，则直接返回
                if (compareStr.length()==j) {
                    return buffer.toString();
                }
                char ch2 = compareStr.charAt(j);

                if (ch == ch2) {
                    if (i==strs.length-1) {
                        //按字符比较完毕，则加入返回的字符串
                        buffer.append(ch);
                    }
                    continue;
                }
                else {
                    return buffer.toString();
                }
            }
        }

        return buffer.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}