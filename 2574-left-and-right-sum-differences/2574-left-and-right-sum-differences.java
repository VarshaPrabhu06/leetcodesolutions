class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        //LeftSum
        int sumL=sum;
        int[] leftSum=new int[n];
        for(int i=n-1;i>=0;i--){
            sumL=sumL-nums[i];
            leftSum[i]=sumL;
        }
        //RightSum
        int sumR=sum;
        int rightSum[]=new int[n];
        for(int i=0;i<n;i++){
            sumR=sumR-nums[i];
            rightSum[i]=sumR;
        }
        //find result
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            res[i]=Math.abs(rightSum[i]-leftSum[i]);
        }
        return res;

        
    }
}