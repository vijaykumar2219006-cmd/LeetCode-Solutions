class Solution {
    public int majorityElement(int[] nums) {
        int i=0;
        int count=0;
        for(int num:nums){
            if(count==0){
                i=num;
            }
            if(num==i){
                count++;
            }else{
                count--;
            }
        }
        return i;
    }
}