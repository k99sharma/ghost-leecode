class Solution {
    public int maxArea(int[] height) {
        int p = 0, q = height.length-1;
        
        int area = 0;
        
        while(p < q){
            int minHeight = Math.min(height[p], height[q]);
            int distance = q-p;
            
            int tempArea = minHeight * distance;
            
            if(minHeight == height[p])
                p++;
            else
                q--;
            
            area = Math.max(area, tempArea);
        }
        
        return area;
    }
}