class Solution {
    public void sortColors(int[]arr) {

        int l=0;
        int r=arr.length-1;
        int m=0;
        while(m<=r)
        {
            if(arr[m]==0)
            {
                int t=arr[m];
                arr[m]=arr[l];
                arr[l]=t;
                l++;
                m++;
            }

            else if(arr[m]==2)
            {
                int t1=arr[m];
                arr[m]=arr[r];
                arr[r]=t1;
                r--;

            }

            else
            {
                m++;
            }

        }
        
    }
}