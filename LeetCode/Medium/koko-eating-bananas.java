class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        for(int i=0;i<piles.length;i++)
        {
            if(piles[i]>max)
            {
                max=piles[i];
            }
        }

        for(int i=1;i<=max;i++)
        {
            int r=0;
            for(int j=1;j<piles.length;j++)
            {
                r=r+(piles[j]-i-1)/i;

            }

            if(r<=max) 
            {
                return i;
            }
        }

        return max;
        
    }
}