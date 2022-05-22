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
            return 0;
        
        return Math.max(height(root.left), height(root.right)) + 1;
    }
    
    public boolean isBalanced(TreeNode root) {
        if(root == null)
            return true;
        
        Queue<TreeNode> q = new ArrayDeque<> ();
        q.add(root);
        
        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            
            if(Math.abs(height(curr.left) - height(curr.right)) > 1)
                return false;
            
            if(curr.left != null)
                q.add(curr.left);
            
            if(curr.right != null)
                q.add(curr.right);
        }
        
        return true;
    }
}