class Solution {
    public List<Integer> getRow(int rowIndex) {
            List<Integer>l=new ArrayList<>();
            long val=1;
            for(int j=0;j<=rowIndex;j++)
            {
                l.add((int)val);
                val=val*(rowIndex-j)/(j+1);
            }

        return l;

        
    }
}