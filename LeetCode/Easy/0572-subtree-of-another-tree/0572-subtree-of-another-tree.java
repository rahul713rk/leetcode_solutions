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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (subRoot == null){ return true;}
        if (root == null){return false;}
        if (isSame(root , subRoot)) {return true;}
        return isSubtree(root.left , subRoot)  || isSubtree(root.right , subRoot);
    }

    public boolean isSame(TreeNode x , TreeNode y){
        if (x == null && y== null){
            return true;
        } else if ((x == null && y != null) || (x != null && y == null)) {
            return false;
        }
        return (x.val == y.val) && (isSame(x.left , y.left))  && isSame(x.right , y.right);
    }
}