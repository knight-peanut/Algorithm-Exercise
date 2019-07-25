/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */


 //解法一:递归深度优先搜索
class Solution {
    int sum;
    public int rangeSumBST(TreeNode root, int L, int R) {
        sum=0;
        dfs(root,L,R);
        return sum;
    }
    
    public void dfs(TreeNode node, int L,int R){
        if(node != null){
            if(node.val >=L && node.val <=R)
                sum += node.val;
            if(node.val > L)
                dfs(node.left,L,R);
            if(node.val < R)
                dfs(node.right,L,R);
        }
    }
}




//解法二：栈入栈出迭代搜索
class Solution {
    public int rangeSumBST(TreeNode root, int L, int R) {
        int ans = 0;
        Stack<TreeNode> stack = new Stack();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node != null) {
                if (L <= node.val && node.val <= R)
                    ans += node.val;
                if (L < node.val)
                    stack.push(node.left);
                if (node.val < R)
                    stack.push(node.right);
            }
        }
        return ans;
    }
}

