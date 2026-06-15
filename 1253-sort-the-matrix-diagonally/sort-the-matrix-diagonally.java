class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        HashMap<Integer,PriorityQueue<Integer>>hp=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                hp.computeIfAbsent(i-j,k ->new PriorityQueue<>());
                hp.get(i-j).offer(mat[i][j]);
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
               
                mat[i][j]=hp.get(i-j).poll();
            }
        }


        return mat;




        
    }
}