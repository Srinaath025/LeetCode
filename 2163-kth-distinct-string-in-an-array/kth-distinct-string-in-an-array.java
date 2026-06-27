class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer>hp=new HashMap<>();
        for(String s:arr)
        {
            hp.put(s,hp.getOrDefault(s,0)+1);
        }

        int c=0;
        for(String s:arr)
        {
            if(hp.get(s)==1)
            {
                c++;
                if(c==k)
                {
                    return s;
                }
                
            }
        }

        return "";
        
    }
}