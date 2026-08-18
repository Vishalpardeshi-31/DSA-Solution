class Solution {
    public int reverse(int x) {
       int reversenum =0;

        while( x != 0){
           int digit = x%10;
           x= x/10;
            if (reversenum > Integer.MAX_VALUE / 10 || 
                (reversenum == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }

            if (reversenum < Integer.MIN_VALUE / 10 || 
                (reversenum == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            reversenum = reversenum * 10 + digit;


        }
        return reversenum;
    }
}