import java.util.Scanner;
class Solution {
    public static int[] getConcatenation(int[] nums) {
        int n=nums.length;

        int[] arr=new int[2*n];

        for(int i=0;i<n;i++){
            arr[i]=nums[i];
            arr[i+n]=nums[i];
        }
        return arr; 
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the array Elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] res=getConcatenation(arr);
        System.out.println("Concatenated array is:");
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]+" ");
        }


    }
}