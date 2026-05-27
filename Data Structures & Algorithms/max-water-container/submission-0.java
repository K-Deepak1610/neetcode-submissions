class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length-1;
        int result = -1;
        while(left<right){
            int width = right - left;
            int length = Math.min(heights[left],heights[right]);
            result = Math.max(result,width*length);
            if(heights[left]<heights[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return result;
    }
}
