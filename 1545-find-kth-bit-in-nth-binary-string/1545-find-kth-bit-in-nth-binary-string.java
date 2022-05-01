class Solution {
    public StringBuilder invertAndReverse(String s){
        //inverting the bits of the given string using XOR with 1;
        char[] chars = new char[s.length()];

        for(int i=0;i<s.length();i++){
            chars[i] = (char)(s.charAt(i)^1);
        }
        String flipped = new String(chars);

        StringBuilder str = new StringBuilder(flipped); 

        return str.reverse();
    }
    
    public String binStr(int n){
        if(n == 1)
            return "0";
        
        return binStr(n-1) + "1" + invertAndReverse(binStr(n-1));
    }
    
    public char findKthBit(int n, int k) {
        String bin = binStr(n);
        
        System.out.println(bin);
        return bin.charAt(k-1);
    }
}