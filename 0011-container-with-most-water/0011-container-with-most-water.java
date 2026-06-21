class Solution {
    public int maxArea(int[] height) {
        int maxwater=0;
        int left=0;
        int right=height.length-1;
        while(left<right){
            
            int currWater=Math.min(height[left],height[right])*(right-left);
            maxwater=Math.max(currWater,maxwater);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxwater;
    }
}