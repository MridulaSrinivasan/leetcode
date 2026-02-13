// Last updated: 2/13/2026, 11:32:44 AM
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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        s1.push(root1);
        s2.push(root2);

        while (!s1.isEmpty() && !s2.isEmpty()) {
            int leaf1 = getNextLeaf(s1);
            int leaf2 = getNextLeaf(s2);
            if (leaf1 != leaf2) return false; 
        }

        return s1.isEmpty() && s2.isEmpty(); 
    }

    private int getNextLeaf(Stack<TreeNode> stack) {
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node.right != null) stack.push(node.right); 
            if (node.left != null) stack.push(node.left);   
            if (node.left == null && node.right == null) {
                return node.val; 
            }
        }
        return -1;
    }
}
    

