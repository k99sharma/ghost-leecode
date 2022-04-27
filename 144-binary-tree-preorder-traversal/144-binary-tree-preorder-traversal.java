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
    public List<Integer> preorderTraversal(TreeNode root) {
        // iterative approach
        List<Integer> result = new ArrayList<> ();
        TreeNode curr = root;
        
        if(root == null)
            return result;
        
        Stack<TreeNode> st = new Stack<> ();
        
        while(!st.empty() || curr != null){
            if(curr != null){
                result.add(curr.val);
                st.push(curr);
                curr = curr.left;
            }else{
                curr = st.pop();
                curr = curr.right;
            }
        }
        
        
        return result;
    }
}