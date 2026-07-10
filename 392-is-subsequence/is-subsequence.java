class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        char []ch=s.toCharArray();
        char []ch1=t.toCharArray();
        while(i<s.length() && j<t.length())
        {
            if(ch[i]==ch1[j])
            {
                i++;
            }
            j++;
        }

        return i==s.length();
        
    }
}