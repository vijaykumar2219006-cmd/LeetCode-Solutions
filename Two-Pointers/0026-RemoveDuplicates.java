public class 0026-RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int left=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]!=nums[left]){
                left++;
                nums[left]=nums[right];
            }
        }
        // System.out.println(left+1);
        for(int i=0;i<=left;i++)
            System.out.println(nums[i]+" ");
        return left+1;

    }
}
