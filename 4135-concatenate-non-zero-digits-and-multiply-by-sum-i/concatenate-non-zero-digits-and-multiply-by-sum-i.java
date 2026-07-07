class Solution {
    public long sumAndMultiply(int n) {
        StringBuilder sb=new StringBuilder();
        int sum=0;
        while(n>0)
        {
            int l=n%10;
            if(l!=0)
            {
                sb.append(l);
                sum=sum+l;
            }
            n=n/10;
        }
        if(sb.length()==0) return 0;
        String s=sb.reverse().toString();
        long s1=Long.parseLong(s);
        return s1*sum;

    }
}