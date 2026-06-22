class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long c=0;
        long curr=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                curr++;
                c=c+curr;

            }
            else 
            {
                curr=0;
            }
        }

        return c;
        
    }
}