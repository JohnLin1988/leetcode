//给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。 
//
// 
//
// 示例： 
//
// s = "leetcode"
//返回 0
//
//s = "loveleetcode"
//返回 2
// 
//
// 
//
// 提示：你可以假定该字符串只包含小写字母。 
// Related Topics 哈希表 字符串 
// 👍 282 👎 0

package com.cute.leetcode.editor.cn;

import java.util.HashMap;

public class FirstUniqueCharacterInAString {
    public static void main(String[] args) {
        Solution solution = new FirstUniqueCharacterInAString().new Solution();
        System.out.println(solution.firstUniqChar("cc"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int firstUniqChar(String s) {
            int[] charIndex = new int[26];
            //统计每个字符出现的个数
            char[] cs = s.toCharArray();
            for (char c : cs) {
                charIndex[c-'a'] ++;
            }

            //遍历字符，找到第一个统计次数为1的数字
            for (int i = 0; i <cs.length; i++) {
                if(charIndex[cs[i] -'a'] == 1) {
                    return i;
                }
            }
            return -1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}