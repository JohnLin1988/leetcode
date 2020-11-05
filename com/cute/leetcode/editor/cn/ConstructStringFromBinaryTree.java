//你需要采用前序遍历的方式，将一个二叉树转换成一个由括号和整数组成的字符串。 
//
// 空节点则用一对空括号 "()" 表示。而且你需要省略所有不影响字符串与原始二叉树之间的一对一映射关系的空括号对。 
//
// 示例 1: 
//
// 
//输入: 二叉树: [1,2,3,4]
//       1
//     /   \
//    2     3
//   /    
//  4     
//
//输出: "1(2(4))(3)"
//
//解释: 原本将是“1(2(4)())(3())”，
//在你省略所有不必要的空括号对之后，
//它将是“1(2(4))(3)”。
// 
//
// 示例 2: 
//
// 
//输入: 二叉树: [1,2,3,null,4]
//       1
//     /   \
//    2     3
//     \  
//      4 
//
//输出: "1(2()(4))(3)"
//
//解释: 和第一个示例相似，
//除了我们不能省略第一个对括号来中断输入和输出之间的一对一映射关系。
// 
// Related Topics 树 字符串 
// 👍 159 👎 0

package com.cute.leetcode.editor.cn;



public class ConstructStringFromBinaryTree {
    public static void main(String[] args) {
        Solution solution = new ConstructStringFromBinaryTree().new Solution();
        TreeNode tree = new ConstructStringFromBinaryTree().new TreeNode(1);
        tree.left = new ConstructStringFromBinaryTree().new TreeNode(2);
        tree.right = new ConstructStringFromBinaryTree().new TreeNode(3);
        tree.left.left =new ConstructStringFromBinaryTree().new TreeNode(4);
        System.out.println(solution.tree2str(tree));
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode(int x) { val = x; }
     * }
     */
    class Solution {
        StringBuffer str =new StringBuffer();
        public String tree2str(TreeNode t) {
            preOrderTraverse(t);
            return str.toString();
        }

        public void preOrderTraverse(TreeNode t){
            if (t != null){
//                System.out.println(t.val);
                str.append(t.val);
                if (t.left!= null || (t.left== null && t.right!= null)){
                    str.append('(');
                    preOrderTraverse(t.left);
                    str.append(')');
                }

                if (t.right!= null){
                    str.append('(');
                    preOrderTraverse(t.right);
                    str.append(')');
                }
            }
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}