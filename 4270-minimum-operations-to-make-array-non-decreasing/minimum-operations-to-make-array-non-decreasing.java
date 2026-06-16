class Solution {
    public long minOperations(int[] nums) {
        int[]ans=nums;
        long c=0;
        for(int i=ans.length-2;i>=0;i--)
        {
            if(ans[i]>ans[i+1])
            {
                c=c+ans[i]-ans[i+1];
            }
        }

        return c;
    }
}