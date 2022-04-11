class Solution {
    public String removeDuplicates(String s) {
        Stack <Character> st = new Stack<> ();
        
        if(s.length() == 1)
            return s;
        
        for(int i=0; i<s.length(); i++){
            if(st.empty()){
                st.push(s.charAt(i));
                continue;
            }
            
            if(st.peek() == s.charAt(i)){
                st.pop();
            }else{
                st.push(s.charAt(i));
            }
        }
        
        String result = "";
        while(!st.empty()){
            result = st.pop() + result;
        }
        
        return result;
    }
}