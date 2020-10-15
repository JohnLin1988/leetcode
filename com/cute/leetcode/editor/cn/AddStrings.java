//给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和。 
//
// 
//
// 提示： 
//
// 
// num1 和num2 的长度都小于 5100 
// num1 和num2 都只包含数字 0-9 
// num1 和num2 都不包含任何前导零 
// 你不能使用任何內建 BigInteger 库， 也不能直接将输入的字符串转换为整数形式 
// 
// Related Topics 字符串 
// 👍 272 👎 0

package com.cute.leetcode.editor.cn;
public class AddStrings {
    public static void main(String[] args) {
        Solution solution = new AddStrings().new Solution();
        System.out.println(solution.addStrings("999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999","1"));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String addStrings(String num1, String num2) {
        String sumString = "";
        //取最长的字符长的长度
        int maxlength = num1.length()>num2.length() ? num1.length() : num2.length();

        //进位标记位
        int flag = 0;
        for (int i = 0; i < maxlength; i++) {
            //各自从最后一个字符转数字相加
            int n1 = 0;
            int n2 = 0;
            if (i<num1.length()){
                n1 = num1.charAt(num1.length()-1-i)-48;
            }
            if (i<num2.length()){
                n2 = num2.charAt(num2.length()-1-i)-48;
            }

            //对应的各位求和，进位则把flag设为1，否则设为0
            int sum = n1+n2+flag;
            if (n1+n2+flag >= 10){
                flag = 1;
            }else {
                flag = 0;
            }
            sumString = sum%10 + sumString;
        }
        if (flag == 1){
            sumString = flag+sumString;
        }
        return  sumString;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}