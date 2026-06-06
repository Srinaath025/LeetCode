class Solution {
    public int[] leftRightDifference(int[] nums) {
        int lsum=0;
        int r=0;
        int sum=0;
        int[]ans=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
        }

        for(int i=0;i<nums.length;i++)
        {
            r=sum-lsum-nums[i];
            ans[i]=Math.abs(lsum-r);
            lsum=lsum+nums[i];

        }


        return ans;



        
    }
}