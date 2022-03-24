class Solution {
    public int minimumSum(int num) {
        int[] result = new int[4];
        int counter = 0;
        
        while(num != 0){
            int rem = num%10;
            result[counter] = rem;
            num = num/10;
            counter++;
        }
        
        // sort array
        Arrays.sort(result);
        
        int new1 = result[0]*10 + result[3];
        int new2 = result[1]*10 + result[2];
        
        return new1 + new2;
    }
}