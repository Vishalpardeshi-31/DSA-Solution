class Solution {
    public int rob(int[] nums) {
        int prev = 0; 
        int abhi = 0;  
        
        for (int num : nums) {
            int temp = Math.max(abhi, prev + num);
            prev = abhi;
            abhi = temp;
        }
        
        return abhi;
    }
}   