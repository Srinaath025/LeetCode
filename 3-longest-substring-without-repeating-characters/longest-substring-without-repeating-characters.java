class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>hp=new HashSet<>();
        int l=0;
        int max=0;
        for(int r=0;r<s.length();r++)
        {
            while(hp.contains(s.charAt(r)))
            {
                hp.remove(s.charAt(l));
                l++;
            }

            hp.add(s.charAt(r));
            max=Math.max(max,r-l+1);
        }

        return max;
        
    }
}