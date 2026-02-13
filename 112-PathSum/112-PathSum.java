// Last updated: 2/13/2026, 11:33:34 AM
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
    public boolean check(TreeNode rt,int ts,int sum){
        if(rt.left==null&&rt.right==null){
            if(sum==ts){
                return true;
            }else{return false;}
        }
        if(rt.right==null){
            return check(rt.left,ts,sum+rt.left.val);
        }
        
        if(rt.left==null){
            return check(rt.right,ts,sum+rt.right.val);
        }
        if(rt.left!=null&&rt.right!=null){
            return  check(rt.left,ts,sum+rt.left.val) || check(rt.right,ts,sum+rt.right.val);
        }

          return false;



    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }else{
            return check(root,targetSum,root.val);
        }
        
    }
}