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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<> ();
        Stack<TreeNode> st = new Stack<> ();
        TreeNode curr = root;
        
        while(!st.empty() || curr != null){
            if(curr != null){
                st.push(curr);
                curr = curr.left;
            }else{
                curr = st.pop();
                result.add(curr.val);
                curr = curr.right;
            }
        }
        
        return result;
    }
}