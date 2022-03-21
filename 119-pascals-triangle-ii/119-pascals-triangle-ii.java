class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<> ();
        rowIndex++;
        result.add(1);
        // if rowIndex == 1
        if(rowIndex <= 1)
            return result;
        
        List<Integer> pre = new ArrayList<> ();
        for(int i=2; i<=rowIndex; i++){
            List<Integer> curr = new ArrayList<> ();
            // adding first number
            curr.add(1);
            
            for(int j=0; j<pre.size()-1; j++)
                curr.add(pre.get(j) + pre.get(j+1));
            
            // adding last number
            curr.add(1);
            
            pre = curr;
        }
        
        result = pre;
        return result;
    }
}