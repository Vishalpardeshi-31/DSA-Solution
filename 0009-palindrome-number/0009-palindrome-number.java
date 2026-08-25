class Solution {
    public boolean isPalindrome(int x) {
         if (x < 0) {
            return false;
        }
        int asli = x;
        int reversnum =0;
        while(x != 0){
            int didgit = x%10;
            reversnum = reversnum*10 + didgit;
            x = x/10;
        }
        return asli==reversnum;
    }
}