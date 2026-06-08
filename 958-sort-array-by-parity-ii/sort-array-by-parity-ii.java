class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n=nums.length;
        int p=0;
        int q=0;
        int[]pos=new int[n/2];
        int[]neg=new int[n/2];
        int[]res=new int[n];
        for(int i=0;i<n;i++)
        {
            if(nums[i]%2==0)
            {
                pos[p++]=nums[i];
            }
            else
            {
                neg[q++]=nums[i];
            }
        }
        int in=0;
        int i=0;
        int j=0;

        while(i<p && j<q)
        {
            res[in++]=pos[i++];
            res[in++]=neg[j++];

        }

        return res;
        
    }
}