class Solution {
    public int maxProfit(int[] prices) {
        int p=0;
        int min=prices[0];
        int n=prices.length;
        for(int i=1;i<n;i++)
        {
            if(prices[i]<min) min=prices[i];
            else if(prices[i]-min>p) p=prices[i]-min;
        }
        return p;
        
    }
}