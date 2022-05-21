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
    
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<Pair> q = new ArrayDeque<> ();
        List<List<Integer>> result = new ArrayList<> ();
        List<Integer> list = new ArrayList<> ();
        
        if(root == null)
            return result;
        
        q.add(new Pair(0, root));
        int curr_level = 0;
        while(!q.isEmpty()){
            Pair curr = q.poll();
            
            if(curr.level == curr_level){
                list.add(curr.node.val);
            }else{
                if((curr_level&1) != 0)
                    Collections.reverse(list);
                                
                result.add(new ArrayList<Integer> (list));
                list.clear();
                
                list.add(curr.node.val);
                curr_level = curr.level;
            }
            
            if(curr.node.left != null)
                q.add(new Pair(curr.level+1, curr.node.left));
            
            if(curr.node.right != null)
                q.add(new Pair(curr.level+1, curr.node.right));
        }
        
        if((curr_level&1) != 0)
            Collections.reverse(list);
        result.add(new ArrayList<Integer> (list));
        
        return result;
    }
}