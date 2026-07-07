#include<stdio.h>
#include<stdlib.h>
int* twoSum(int* nums,int numSize,int target,int* returnSize)
{
    int *result=(int*)malloc(2*sizeof(int));
    for(int i=0;i<numSize;i++){
        for(int j=i+1;j<numSize;j++){
            if(nums[i]+nums[j]==target){
                result[0]=i;
                result[1]=j;
                *returnSize=2;
                return result;
            }
        }
    }
}
int main()
{
    int nums[]={2,7,11,19};
    int target=13;
    int numSize=sizeof(nums)/sizeof(nums[0]);
    int returnSize;
    
    int *ans=twoSum(nums,numSize,target,&returnSize);
    
    if(ans!=NULL)
    {
        printf("indices: %d , %d",ans[0],ans[1]);
        free(ans);
    }else{
        printf("no soln found!");
    }
}