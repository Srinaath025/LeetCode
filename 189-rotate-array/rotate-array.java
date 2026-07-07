class Solution {
    public void rotate(int[] nums, int k) {

        int n=nums.length;
        //if(nums.length==0 || nums==null) return;

        k=k%nums.length;

        reverse(nums,0,n-1);//full swap
        reverse(nums,0,k-1);//till k swap
        reverse(nums,k,n-1);//k to rem swap
        
    }

    private void reverse(int []nums,int s,int e)//swap
    {
        while(s<e)
        {
            int t=nums[s];
            nums[s]=nums[e];
            nums[e]=t;
            s++;
            e--;
        }
    }
}