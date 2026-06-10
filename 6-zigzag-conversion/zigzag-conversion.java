class Solution {
    public String convert(String s, int numRows) {
        if(numRows>=s.length()||numRows==1) return s;
        List<Character>[]row=new ArrayList[numRows];
        for(int i=0;i<numRows;i++)
        {
            row[i]=new ArrayList<>();
        }

        int in=0;
        int d=1;

        for(char c:s.toCharArray())
        {
            row[in].add(c);
            if(in==0) 
            {
                d=1;
            }
            else if(in==numRows-1)
            { d=-1;
            }
            in=in+d;
        }

        StringBuilder sb=new StringBuilder();
        for(List<Character>l:row)
        {
            for(char c:l)
            {
            sb.append(c);
            }

        }
       return sb.toString();
        
    }
}