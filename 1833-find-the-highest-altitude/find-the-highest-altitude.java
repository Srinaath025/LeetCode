class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int []p=new int[n+1];
        p[0]=gain[0];
        for(int i=1;i<n;i++)
        {
            p[i]=p[i-1]+gain[i];
        }

        int max=0;
        for(int i=0;i<n;i++)
        {
            if(p[i]>max)
            {
                max=p[i];
            }
        }

        return max;
        
    }
}