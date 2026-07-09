class Solution {
    public static int[] runningSum(int[] nums) {
        int n=nums.length;
        for(int i=1;i<n;i++){
            nums[i]=nums[i]+nums[i-1];
        }
        
        return nums;
    }
    public static void main(String[] args){
        int[] nums={1,2,3,4,5,6,7,8,9};
        int n=nums.length;
        System.out.println(runningSum(nums));
    }
}