class Solution {
    public List<Integer> luckyNumbers(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        ArrayList<Integer>ll=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                int curr=mat[i][j];
                boolean min=true;
                for(int c=0;c<m;c++)
                {
                    if(mat[i][c]<curr)
                    {
                        min=false;
                    }
                }

                boolean max=true;
                for(int r=0;r<n;r++)
                {
                    if(mat[r][j]>curr)
                    {
                        max=false;
                    }
                }

                if(max && min)
                {
                    ll.add(curr);
                }
            }
        }

        return ll;
        
    }
}