class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0) return "";
        int n=strs.length;        
        Arrays.sort(strs);
        String s=strs[0];
        String s1=strs[n-1];
        int c=0;
        while(c<s.length())
        {
            if(s.charAt(c)!=s1.charAt(c))
            {
                break;
            }
            c++;
        }

        return s.substring(0,c);
        
    }
}