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
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> st = new Stack<> ();
        Stack<TreeNode> out = new Stack<> ();
        List<Integer> result = new ArrayList<> ();
        
        if(root == null)
            return result;
        
        st.push(root);
        
        while(!st.empty()){
            TreeNode curr = st.pop();
            out.add(curr);
            
            if(curr.left != null)
                st.push(curr.left);
            
            if(curr.right != null)
                st.push(curr.right);
        }
        
        while(!out.empty())
            result.add(out.pop().val);
        
        return result;
    }
}