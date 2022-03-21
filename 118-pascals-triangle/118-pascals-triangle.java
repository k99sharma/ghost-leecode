class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<> ();
        
        result.add(Arrays.asList(1));
        
        // if numRows == 1
        if(numRows == 1)
            return result;
        
        List<Integer> pre = new ArrayList<> ();
        
        for(int i=2; i<=numRows; i++){
            ArrayList<Integer> curr = new ArrayList<> ();
            
            // adding first element
            curr.add(1);
            
            // adding middle ones
            for(int j=0; j<pre.size()-1; j++){
                curr.add(pre.get(j) + pre.get(j+1));
            }
            
            // adding last element
            curr.add(1);
            
            // adding curr to result
            result.add(curr);
            
            pre = curr;
        }
        
        return result;
    }
}