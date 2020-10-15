//统计字符串中的单词个数，这里的单词指的是连续的不是空格的字符。 
//
// 请注意，你可以假定字符串里不包括任何不可打印的字符。 
//
// 示例: 
//
// 输入: "Hello, my name is John"
//输出: 5
//解释: 这里的单词是指连续的不是空格的字符，所以 "Hello," 算作 1 个单词。
// 
// Related Topics 字符串 
// 👍 60 👎 0

package com.cute.leetcode.editor.cn;
public class NumberOfSegmentsInAString {
    public static void main(String[] args) {
        Solution solution = new NumberOfSegmentsInAString().new Solution();
        System.out.println(solution.countSegments("    foo    bar"));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int countSegments(String s) {
        if (s.trim().length()==0){
            return 0;
        }
        char[] arr = s.trim().toCharArray();
        int count = 0;

        boolean lastCharIsSpace = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == ' '){
                if (lastCharIsSpace == false){
                    count++;
                }
                lastCharIsSpace = true;
            }else{
                lastCharIsSpace = false;
            }
        }
        return count+1;
    }

}
//leetcode submit region end(Prohibit modification and deletion)

}