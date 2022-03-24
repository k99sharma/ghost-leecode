class Solution {
    public String sortSentence(String s) {
        String[] str = s.split(" ");
        String[] result = new String[str.length];
        
        for(String temp : str){
            int pos = temp.charAt(temp.length()-1) - '0';
            String word = temp.substring(0, temp.length()-1);
            
            result[pos-1] = word;
        }
        String ans = "";
        for(String word : result){
            ans += word + " ";
        }
        
        return ans.trim();
    }
}