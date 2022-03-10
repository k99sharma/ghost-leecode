class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        
        boolean spaceAtRight = true;
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i) != ' ')
                spaceAtRight = false;
            
            if(!spaceAtRight){
                if(s.charAt(i) == ' ')
                    break;
                count += 1;
                
            }
        }
        
        return count;
    }
}