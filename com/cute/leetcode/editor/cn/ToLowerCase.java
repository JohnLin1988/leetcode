//实现函数 ToLowerCase()，该函数接收一个字符串参数 str，并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。 
//
// 
//
// 示例 1： 
//
// 
//输入: "Hello"
//输出: "hello" 
//
// 示例 2： 
//
// 
//输入: "here"
//输出: "here" 
//
// 示例 3： 
//
// 
//输入: "LOVELY"
//输出: "lovely"
// 
// Related Topics 字符串 
// 👍 135 👎 0

package com.cute.leetcode.editor.cn;
public class ToLowerCase {
    public static void main(String[] args) {
        Solution solution = new ToLowerCase().new Solution();
        System.out.println(solution.toLowerCase("Hello"));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String toLowerCase(String str) {
        char[] chars = str.toCharArray();
        char[] lowerStr = new char[str.length()];
        for (int i = 0; i < chars.length; i++) {
            int upperASCII = (int)chars[i];
            if (upperASCII>= 65 && upperASCII<=90){
                lowerStr[i] = (char)(upperASCII+97-65);
            }else {
                lowerStr[i]=chars[i];
            }
        }
        return String.valueOf(lowerStr);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}