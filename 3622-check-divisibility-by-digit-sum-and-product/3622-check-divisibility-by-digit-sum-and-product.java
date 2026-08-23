class Solution {
    public boolean checkDivisibility(int n) {
        int sum =0;
        int product =1;
        int number = n;

        while(number !=0){
            int newdigit = number % 10;
            number /= 10;

            sum += newdigit;
            product *= newdigit;
        }
        
        return n % (sum + product) ==0;

    }
}