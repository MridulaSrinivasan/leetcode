// Last updated: 2/13/2026, 11:33:37 AM
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
    public TreeNode sortedArrayToBST(int[] num) {
       if(num.length==0) return null;
       return CreateTree(num,0,num.length-1);
    }
    public TreeNode CreateTree(int []num,int start,int end){
        if(start>end){
            return null;
        }
        int mid = (start+end)/2;
        TreeNode node = new TreeNode(num[mid]);
        node.left = CreateTree(num,start,mid-1);
        node.right = CreateTree(num,mid+1,end);
        return node;
    } 
}