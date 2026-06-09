class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String>l=new HashSet<>();
        HashSet<String>l1=new HashSet<>();
        int n=s.length();
        for(int i=0;i<=n-10;i++)
        {
            if(!l.add(s.substring(i,i+10)))
            {
                l1.add(s.substring(i,i+10));
            }
        }

        return new ArrayList<>(l1);
        
    }
}