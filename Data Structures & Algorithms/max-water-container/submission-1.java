class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int i=0,j=n-1;
        int area=0;
        while(i<=j){
            int h=(j-i)*Math.min(heights[i],heights[j]);
            area=Math.max(area,h);
            if(heights[i]<heights[j])
              i++;
            else
              j--;


        }
        return area;
        
    }
}
