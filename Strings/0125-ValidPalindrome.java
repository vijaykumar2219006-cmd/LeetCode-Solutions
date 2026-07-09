package Strings;
import java.util.*;

class Solution {
    public boolean isPalindrome(String s) {
    
        int left=0;
        int right=s.length()-1;
        while(left<right){

            while(left<right && !Character.isLetterOrDigit(s.charAt(left)) ){
                left++;
            }

            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }

            if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string to check if it is palindrome or not");
        String s=sc.nextLine();
        Solution sol=new Solution();
        if(sol.isPalindrome(s)){
            System.out.println("The string is a palindrome");
        }
        else{
            System.out.println("The string is not a palindrome");
        }
    }
}