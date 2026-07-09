package Strings;
import java.util.*;
public class anagram {
    public static boolean isAnagram(String s,String t) {
        if(s.length()!=t.length())
            return false;

        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch, 0)+1);

        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            map.put(ch,map.get(ch)-1);
        }
        for(int val:map.values()){
            if(val!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first String:");
        String str1=sc.nextLine();
        System.out.println("Enter the second String:");
        String str2=sc.nextLine();
        boolean result=isAnagram(str1,str2);
        if(result){
            System.out.println("The two strings are anagrams.");
        }
        else{
            System.out.println("The two strings are not anagrams.");
        }
    }
}
