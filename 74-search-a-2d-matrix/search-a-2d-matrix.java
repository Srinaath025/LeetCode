class Solution {
    public boolean searchMatrix(int[][] arr, int target) {

        int m=arr.length;
        int n=arr[0].length;
        int i=0;
        int l=0;
        int r=(n*m)-1;
        while(l<=r)
        {
            int mi=(l+r)/2;
            int r1=mi/n;
            int c=mi%n;
            if(target==arr[r1][c])
            {
                return true;
            }

            else if(target<=arr[r1][c])
            {
                r=mi-1;
            }

            else l=mi+1;
        }

        return false;

        
    }
}