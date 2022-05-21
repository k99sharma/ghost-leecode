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
    public int height(TreeNode root){
        if(root == null)
            return -1;
        
        return Math.max(height(root.left), height(root.right)) + 1;
    }
    
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null)
            return 0;
        
        int leftDiameter = diameterOfBinaryTree(root.left);
        int rightDiameter = diameterOfBinaryTree(root.right);
        
        int currDiameter = height(root.left) + height(root.right) + 2;
        
        // diameter will be maximum of left, right, and current node
        return Math.max(leftDiameter, Math.max(rightDiameter, currDiameter));
    }
}