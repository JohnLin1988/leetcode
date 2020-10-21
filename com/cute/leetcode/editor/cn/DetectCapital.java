//给定一个单词，你需要判断单词的大写使用是否正确。 
//
// 我们定义，在以下情况时，单词的大写用法是正确的： 
//
// 
// 全部字母都是大写，比如"USA"。 
// 单词中所有字母都不是大写，比如"leetcode"。 
// 如果单词不只含有一个字母，只有首字母大写， 比如 "Google"。 
// 
//
// 否则，我们定义这个单词没有正确使用大写字母。 
//
// 示例 1: 
//
// 
//输入: "USA"
//输出: True
// 
//
// 示例 2: 
//
// 
//输入: "FlaG"
//输出: False
// 
//
// 注意: 输入是由大写和小写拉丁字母组成的非空单词。 
// Related Topics 字符串 
// 👍 110 👎 0

package com.cute.leetcode.editor.cn;
public class DetectCapital {
    public static void main(String[] args) {
        Solution solution = new DetectCapital().new Solution();
        System.out.println(solution.detectCapitalUse("FFF"));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean detectCapitalUse(String word) {
            //首字母小写，其他字母有大写则返回false
            if (isLowerCase(word.charAt(0))) {
                for (int i = 1; i < word.length(); i++) {
                    if (isCapitalLetter(word.charAt(i))) {
                        return false;
                    }
                }
                return true;
            }
            //首字母小写
            else {
                int capitalLetterCount = 0;
                int lowerCaseCount = 0;
                for (int i = 1; i < word.length(); i++) {
                    if (isCapitalLetter(word.charAt(i))) {
                        capitalLetterCount++;
                    } else if (isLowerCase(word.charAt(i))) {
                        lowerCaseCount++;
                    }
                }

                if (capitalLetterCount != word.length() - 1 && lowerCaseCount != word.length() - 1) {
                    return false;
                }else {
                    return true;
                }

            }
        }

        private boolean isCapitalLetter(char c) {
            int i = (int) c;
            if (i >= 65 && i <= 90) {
                return true;
            }
            return false;

        }

        private boolean isLowerCase(char c) {
            int i = (int) c;
            if (i >= 97 && i <= 122) {
                return true;
            }
            return false;

        }

    }

//leetcode submit region end(Prohibit modification and deletion)

}