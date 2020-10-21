//给你一个字符串 date ，它的格式为 Day Month Year ，其中： 
//
// 
// Day 是集合 {"1st", "2nd", "3rd", "4th", ..., "30th", "31st"} 中的一个元素。 
// Month 是集合 {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oc
//t", "Nov", "Dec"} 中的一个元素。 
// Year 的范围在 [1900, 2100] 之间。 
// 
//
// 请你将字符串转变为 YYYY-MM-DD 的格式，其中： 
//
// 
// YYYY 表示 4 位的年份。 
// MM 表示 2 位的月份。 
// DD 表示 2 位的天数。 
// 
//
// 
//
// 示例 1： 
//
// 输入：date = "20th Oct 2052"
//输出："2052-10-20"
// 
//
// 示例 2： 
//
// 输入：date = "6th Jun 1933"
//输出："1933-06-06"
// 
//
// 示例 3： 
//
// 输入：date = "26th May 1960"
//输出："1960-05-26"
// 
//
// 
//
// 提示： 
//
// 
// 给定日期保证是合法的，所以不需要处理异常输入。 
// 
// Related Topics 字符串 
// 👍 3 👎 0

package com.cute.leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

public class ReformatDate {
    public static void main(String[] args) {
        Solution solution = new ReformatDate().new Solution();
        System.out.println(solution.reformatDate("20th Oct 2052"));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reformatDate(String date) {
        String[] arr = date.split(" ");
        return arr[2]+"-"+getMonthStr(arr[1])+"-"+getDayStr(arr[0]);
    }

    private String getDayStr(String s){
        if (s.charAt(1)>=48 && s.charAt(1)<=57 ){
            return s.substring(0,2);
        }else{
            return "0"+s.charAt(0);
        }
    }

    private String getMonthStr(String s){
        Map<String,String> map = new HashMap<>();
        map.put("Jan","01" );
        map.put("Feb","02" );
        map.put("Mar","03" );
        map.put("Apr","04" );
        map.put("May","05" );
        map.put("Jun","06" );
        map.put("Jul","07" );
        map.put("Aug","08" );
        map.put("Sep","09" );
        map.put("Oct","10" );
        map.put("Nov","11" );
        map.put("Dec","12" );

        return map.get(s);
    }


}
//leetcode submit region end(Prohibit modification and deletion)

}