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
    public void preorder(TreeNode curr, List<Integer> result){
        if(curr == null)
            return;
        
        result.add(curr.val);
        preorder(curr.left, result);
        preorder(curr.right, result);
    }
    
    public List<Integer> preorderTraversal(TreeNode root) {
        // recursive way
        List<Integer> result = new ArrayList<> ();
        if(root == null)
            return result;
        
        TreeNode curr = root;
        
        preorder(curr, result);
        
        return result;
    }
}