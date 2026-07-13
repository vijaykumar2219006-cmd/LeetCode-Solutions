public class 0209-MinSumSubarray {
    public static int minSubarrayLength(int k,int[] nums){
        int left=0;
        int sum=0;
        int minLength=Integer.MAX_VALUE;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            while(sum>=k){
                minLength=Math.min(minLength,right-left+1);
                sum-=nums[left];
                left++;
            }
        }
        return minLength==Integer.MAX_VALUE?0:minLength;
    }
}
