class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int []diff=new int[n];
        for(int i=0;i<bookings.length;i++)
        {
            int s=bookings[i][0]-1;
            int e=bookings[i][1]-1;
            int v=bookings[i][2];
            diff[s]=diff[s]+v;
            if(e+1<n)
            {
                diff[e+1]=diff[e+1]-v;
            }
        }

        int []p=new int[diff.length];
        p[0]=diff[0];
        for(int i=1;i<n;i++)
        {
            p[i]=p[i-1]+diff[i];
        }
        
        return p;
    }
}