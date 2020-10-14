//给定一个字符串来代表一个学生的出勤记录，这个记录仅包含以下三个字符： 
//
// 
// 'A' : Absent，缺勤 
// 'L' : Late，迟到 
// 'P' : Present，到场 
// 
//
// 如果一个学生的出勤记录中不超过一个'A'(缺勤)并且不超过两个连续的'L'(迟到),那么这个学生会被奖赏。 
//
// 你需要根据这个学生的出勤记录判断他是否会被奖赏。 
//
// 示例 1: 
//
// 输入: "PPALLP"
//输出: True
// 
//
// 示例 2: 
//
// 输入: "PPALLL"
//输出: False
// 
// Related Topics 字符串 
// 👍 53 👎 0

package com.cute.leetcode.editor.cn;
public class StudentAttendanceRecordI {
    public static void main(String[] args) {
        Solution solution = new StudentAttendanceRecordI().new Solution();
        System.out.println(solution.checkRecord("PPALLL"));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean checkRecord(String s) {
        int count = 0;
        char[] sChars = s.toCharArray();

        for (int i = 0; i < sChars.length; i++) {
            if (sChars[i] == 'A'){
                count++;
            }
        }
        if (count >=2 || s.contains("LLL")){
            return false;
        }else{
            return true;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}