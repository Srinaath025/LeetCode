class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>hp=new HashSet<>();
        int n=s.length();
        int l=0;
        int max=0;
        for(int i=0;i<n;i++)
        {
            while(hp.contains(s.charAt(i)))
            {
                hp.remove(s.charAt(l));
                l++;
            }

            hp.add(s.charAt(i));
            max=Math.max(max,i-l+1);

        }
        return max;
        
        
    }
}