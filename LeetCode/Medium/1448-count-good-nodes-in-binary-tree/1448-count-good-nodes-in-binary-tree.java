/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int goodNodes(TreeNode root) {
        int[] res = new int[1];
        dfs(root , root.val , root.val , res);
        return res[0];
    }

    private void dfs(TreeNode root , int max , int n , int[] res){
        if (root == null){
            return ;
        }
        max = Math.max(root.val , max);
        if (root.val >= n && root.val >= max){
            res[0] += 1;
        }

        dfs(root.left , max , n , res);
        dfs(root.right , max ,n , res);
        return;
    }
}