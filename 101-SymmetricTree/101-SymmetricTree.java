// Last updated: 2/13/2026, 11:33:39 AM
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
    public boolean isSymmetric(TreeNode root) {
        return mirror (root.left , root.right);
    }
    private boolean mirror(TreeNode T1 , TreeNode T2){
        if(T1==null && T2==null) return true;
        if(T1==null || T2==null) return false;
        if(T1.val != T2.val) return false;
        return mirror(T1.left,T2.right) && mirror(T1.right,T2.left);
    }
}