class Solution {
    public long minimumSteps(String s) 
    {
        int n=s.length();
        long swap=0;
        int f=0;
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(ch=='0')
            {
                swap=swap+(i-f);
                f++;
            }
        }

        return swap;
        
    }
}