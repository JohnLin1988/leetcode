//给你一个仅包含小写英文字母和 '?' 字符的字符串 s，请你将所有的 '?' 转换为若干小写字母，使最终的字符串不包含任何 连续重复 的字符。 
//
// 注意：你 不能 修改非 '?' 字符。 
//
// 题目测试用例保证 除 '?' 字符 之外，不存在连续重复的字符。 
//
// 在完成所有转换（可能无需转换）后返回最终的字符串。如果有多个解决方案，请返回其中任何一个。可以证明，在给定的约束条件下，答案总是存在的。 
//
// 
//
// 示例 1： 
//
// 输入：s = "?zs"
//输出："azs"
//解释：该示例共有 25 种解决方案，从 "azs" 到 "yzs" 都是符合题目要求的。只有 "z" 是无效的修改，因为字符串 "zzs" 中有连续重复的两
//个 'z' 。 
//
// 示例 2： 
//
// 输入：s = "ubv?w"
//输出："ubvaw"
//解释：该示例共有 24 种解决方案，只有替换成 "v" 和 "w" 不符合题目要求。因为 "ubvvw" 和 "ubvww" 都包含连续重复的字符。
// 
//
// 示例 3： 
//
// 输入：s = "j?qg??b"
//输出："jaqgacb"
// 
//
// 示例 4： 
//
// 输入：s = "??yw?ipkj?"
//输出："acywaipkja"
// 
//
// 
//
// 提示： 
//
// 
// 
// 1 <= s.length <= 100 
// 
// 
// s 仅包含小写英文字母和 '?' 字符 
// 
// 
// Related Topics 字符串 
// 👍 9 👎 0

package com.cute.leetcode.editor.cn;

import java.util.*;

public class ReplaceAllSToAvoidConsecutiveRepeatingCharacters {
    public static void main(String[] args) {
        Solution solution = new ReplaceAllSToAvoidConsecutiveRepeatingCharacters().new Solution();
        System.out.println(solution.modifyString("j?qg??b"));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
        public String modifyString(String s) {
            int length = s.length();
            //左右先加问号，方便计算，后期去掉
            s = '?'+s+'?';
            char[] chars = s.toCharArray();
            char[] newChars = new char[s.length()];

            char leftChar = '?';
            for (int i = 1; i <chars.length-1; i++) {
                if (chars[i] != '?'){
                    newChars[i] = chars[i];
                    leftChar = chars[i];
                }else {

                    Map<Character,Character> map = getRandomLetter();

                    if (map.containsKey(leftChar)){
                        map.remove(leftChar);
                    }
                    char rightChar = chars[i+1];
                    if (map.containsKey(rightChar)){
                        map.remove(rightChar);
                    }
                    for (Character key : map.keySet()) {
                        leftChar = map.get(key);
                        newChars[i] = leftChar;
                        break;
                    }
                }
            }
            return String.valueOf(newChars).substring(1,length+1);
        }

        private Map<Character,Character> getRandomLetter(){
            Map<Character,Character> map = new HashMap<Character,Character>();
            map.put('a','a');
            map.put('b','b');
            map.put('c','c');
            return map;
        }
}
//leetcode submit region end(Prohibit modification and deletion)

}