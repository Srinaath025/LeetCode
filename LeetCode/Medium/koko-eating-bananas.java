
            long r = 0;
        }

        for(int i = 1; i <= max; i++) {

            for(int j = 0; j < piles.length; j++) {
                r += (piles[j] + i - 1L) / i;
            }

            if(r <= h) {
                return i;
            }
        }

        return max;
    }
}

        for(int i = 0; i < piles.length; i++) {
            max = Math.max(max, piles[i]);
        int max = 0;
    public int minEatingSpeed(int[] piles, int h) {
class Solution {
