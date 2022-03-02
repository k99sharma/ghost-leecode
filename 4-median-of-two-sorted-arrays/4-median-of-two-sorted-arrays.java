class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        
        if(n == 0 && m == 0)
            return 0;
        
        // creating a combined array
        int[] total = new int[n+m];
        int p = 0, q = 0;
        int counter = 0;
        
        while(p < n && q < m){
            if(nums1[p] <= nums2[q]){
                total[counter] = nums1[p];
                p++;
            }    
            else{
                total[counter] = nums2[q];
                q++;
            }
            
            counter++;
        }
        
        
        // left elements
        while(p < n){
            total[counter] = nums1[p];
            p++;
            counter++;
        }
        
        while(q < m){
            total[counter] = nums2[q];
            q++;
            counter++;
        }
        
        if((counter&1) == 1)
            return (double) total[counter/2];
            
        return (double) (total[counter/2 - 1] + total[counter/2])/2;
    }
}