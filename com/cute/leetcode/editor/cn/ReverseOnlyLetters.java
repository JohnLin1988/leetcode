//给定一个字符串 S，返回 “反转后的” 字符串，其中不是字母的字符都保留在原地，而所有字母的位置发生反转。 
//
// 
//
// 
// 
//
// 示例 1： 
//
// 输入："ab-cd"
//输出："dc-ba"
// 
//
// 示例 2： 
//
// 输入："a-bC-dEf-ghIj"
//输出："j-Ih-gfE-dCba"
// 
//
// 示例 3： 
//
// 输入："Test1ng-Leet=code-Q!"
//输出："Qedo1ct-eeLg=ntse-T!"
// 
//
// 
//
// 提示： 
//
// 
// S.length <= 100 
// 33 <= S[i].ASCIIcode <= 122 
// S 中不包含 \ or " 
// 
// Related Topics 字符串 
// 👍 63 👎 0

package com.cute.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

public class ReverseOnlyLetters {
    public static void main(String[] args) {
        Solution solution = new ReverseOnlyLetters().new Solution();
        System.out.println(solution.reverseOnlyLetters("a-bC-dEf-ghIj"));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reverseOnlyLetters(String S) {
        char[] sToChars = S.toCharArray();
        char[] temp = new char[S.length()];
        List<Character> list = new ArrayList<Character>();
        //将字母取到list中
        for (int i = 0; i < sToChars.length; i++) {
            char c = sToChars[i];
            if (charIsLetter(c)){
                list.add(c);
            }
        }
        //将非字母的字符取到临时数组，把字母的字符用list中的字母倒序写入临时数组
        for (int i = 0; i < sToChars.length; i++) {
            char c = sToChars[i];
            if (!charIsLetter(c)) {
                temp[i] = sToChars[i];
            }else {
                temp[i]=list.get(list.size()-1);
                list.remove(list.size()-1);
            }
        }
        return String.valueOf(temp);
    }

        /**
         * 判断字符是否是字母
         * @param c
         * @return
         */
    public boolean charIsLetter(char c){
        if (((int)c>=65 && (int)c<=90) || ((int)c>=97 && (int)c<=122)){
            return true;
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}