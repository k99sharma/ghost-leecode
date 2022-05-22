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
    class Pair{
        int level;
        TreeNode node;
        
        Pair(int level, TreeNode node){
            this.level = level;
            this.node = node;
        }
    }
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<Pair> q = new ArrayDeque<> ();
        
        List<List<Integer>> result = new ArrayList<> ();
        List<Integer> curr = new ArrayList<> ();
        
        if(root == null)
            return result;
        
        q.add(new Pair(0, root));
        int curr_level = 0;
        
        while(!q.isEmpty()){
            Pair currNode = q.poll();
            
            if(currNode.level == curr_level)
                curr.add(currNode.node.val);
            
            else{
                result.add(new ArrayList<Integer> (curr));
                curr.clear();
                
                curr_level = currNode.level;
                curr.add(currNode.node.val);
            }
            
            if(currNode.node.left != null)
                q.add(new Pair(currNode.level+1, currNode.node.left));
            
            if(currNode.node.right != null)
                q.add(new Pair(currNode.level+1, currNode.node.right));
        }
        
        result.add(curr);
        
        return result;
    }
}