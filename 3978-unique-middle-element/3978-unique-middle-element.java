class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int mid=nums[nums.length/2];
        int midcnt=0;
        for(int i:nums){
            if(i==mid){
                midcnt++;
            }
        }
        return midcnt==1;
    }
}