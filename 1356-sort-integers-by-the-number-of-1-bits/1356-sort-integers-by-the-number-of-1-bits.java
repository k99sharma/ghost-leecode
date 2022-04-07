class Solution {
    public int findNumberOfBits(int num){
        int count = 0;
        
        while(num != 0){
            if((num&1) == 1)
                count++;
            
            num = num >> 1;
        }
        
        return count;
    }
    
    public int[] sortByBits(int[] arr) {
        int[][] bits = new int[arr.length][2];
        
        for(int x=0; x<arr.length; x++){
            bits[x][0] = arr[x];
            bits[x][1] = findNumberOfBits(arr[x]);
        }
        
        Arrays.sort(bits, new Comparator<int[]>() {
            public int compare(int[] a, int[] b){
                if(a[1] != b[1]) 
                    return a[1]-b[1];
                else
                    return a[0]-b[0];
            }
        });
        
        for(int x=0; x<arr.length; x++){
            arr[x] = bits[x][0];
        }
        
        return arr;
    }
}