class Solution {
    public void combinations(int target, int[] candidates, int idx, List<Integer> comb, List<List<Integer>> list){
        if(idx == candidates.length)
            return;
        
        if(target < 0)
            return;
        
        if(target == 0){
            list.add(new ArrayList<> (comb));
            // System.out.println(Arrays.toString(list.toArray()));
            // System.out.println(Arrays.toString(comb.toArray())); // debug
            return;
        }
        
        target = target - candidates[idx];
        comb.add(candidates[idx]);
        combinations(target, candidates, idx, comb, list);
        comb.remove(comb.size()-1);
        target = target + candidates[idx];
        combinations(target, candidates, idx+1, comb, list);
    }
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<> ();
        List<Integer> comb = new ArrayList<> ();
        
        combinations(target, candidates, 0, comb, list);
        
        return list;
    }
}