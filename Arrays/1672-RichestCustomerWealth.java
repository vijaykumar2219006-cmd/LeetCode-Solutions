import java.util.*;
class Solution {
    public static int maximumWealth(int[][] accounts) {
        int maxWealth=0;
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum=sum+accounts[i][j];
            }
            if(sum>maxWealth){
                maxWealth=sum;
            }
        }
        return maxWealth;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row size:");
        int m=sc.nextInt();
        System.out.println("Enter the column size:");
        int n=sc.nextInt();
        int[][] accounts=new int[m][n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                accounts[m][n]=sc.nextInt();
            }
        }
        int richest=maximumWealth(accounts);
        System.out.println("the richest man is:"+richest);

    }
}