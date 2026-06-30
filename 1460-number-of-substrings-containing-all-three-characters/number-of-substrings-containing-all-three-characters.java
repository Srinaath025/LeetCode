class Solution {
    public int numberOfSubstrings(String s) {
        int[] x = new int[3]; 
        int l = 0;
        int res = 0;
        int n = s.length();

        for (int r = 0; r < n; r++) {
            x[s.charAt(r) - 'a']++;

            while (x[0] > 0 && x[1] > 0 && x[2] > 0) {
                res += n - r;
                x[s.charAt(l) - 'a']--;
                l++;
            }
        }
        return res;
    }
}
