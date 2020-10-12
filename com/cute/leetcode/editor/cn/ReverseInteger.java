//给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。 
//
// 示例 1: 
//
// 输入: 123
//输出: 321
// 
//
// 示例 2: 
//
// 输入: -123
//输出: -321
// 
//
// 示例 3: 
//
// 输入: 120
//输出: 21
// 
//
// 注意: 
//
// 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231, 231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。 
// Related Topics 数学 
// 👍 2251 👎 0

package com.cute.leetcode.editor.cn;
public class ReverseInteger {
    public static void main(String[] args) {
        Solution solution = new ReverseInteger().new Solution();
        System.out.println(solution.reverse(-321));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int reverse(int x) {
        int result= 0;
        Long temp = 0L;
        Long longX = (long)x;
        //按字符交换数字位，小数保留第一个字符位，其余字符首尾交换
        if (x<0){

            String xToStr = String.valueOf(-longX);
            char[] xToChar = xToStr.toCharArray();
            char[] newChar = new char[xToChar.length];
            for (int i = 0; i < xToChar.length; i++) {
                newChar[i]=xToChar[xToChar.length-1-i];
            }
            temp = -Long.valueOf(String.valueOf(newChar));
        }else{
            String xToStr = String.valueOf(x);
            char[] xToChar = xToStr.toCharArray();
            char[] newChar = new char[xToChar.length];
            for (int i = 0; i < xToChar.length; i++) {
                newChar[i]=xToChar[xToChar.length-1-i];
            }
            temp = Long.valueOf(String.valueOf(newChar));
        }

        //反转后整数溢出那么就返回 0
        if (temp>Integer.MAX_VALUE || temp<Integer.MIN_VALUE) {
            result = 0;
        }else{
            result =temp.intValue();
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}