class Solution {
    public boolean isPalindrome(int x) {
        int Og=x;
        int rev=0;
        int last;
        while(x>0){
            last=x%10;
            rev=rev*10+last;
            x=x/10;
        }
        return Og == rev;
    }

}