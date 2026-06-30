class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int n=intervals.length;
        int m=intervals[0].length;
        int s=intervals[0][0];
        int e=intervals[0][1];
        List<int[]>l=new ArrayList<>();
        for(int i=1;i<intervals.length;i++)
        {
            if(intervals[i][0]<=e)
            {
                e=Math.max(e,intervals[i][1]);
            }

            else
            {
                l.add(new int[]{s,e});
                s=intervals[i][0];
                e=intervals[i][1];
            }
        }

        l.add(new int[]{s,e});
        int[][]res=new int[l.size()][];

        for(int i=0;i<l.size();i++)
        {
            res[i]=l.get(i);
        }

        return res;

        
    }
}