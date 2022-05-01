class Solution {
    public String findCorrectStr(String s){
        Stack<Character> st = new Stack<> ();
        for(char x : s.toCharArray()){
            if(x == '#'){
                if(st.empty())
                    continue;
                else
                    st.pop();   
            }else{
                st.push(x);
            }
        }
        
        String temp = "";
        while(!st.empty()){
            temp += st.pop();
        }
        System.out.println(temp);
        return temp;
    }
    
    public boolean backspaceCompare(String s, String t) {        
        if(!findCorrectStr(s).equals(findCorrectStr(t)))
            return false;
        
        return true;
    }
}