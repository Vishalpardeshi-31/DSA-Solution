class Solution {
    public int rob(int[] nums) {
        int prev = 0; 
        int cur = 0;  
        
        for (int num : nums) {
            int temp = Math.max(cur, prev + num);
            prev = cur;
            cur = temp;
        }
        
        return cur;
    }
}   