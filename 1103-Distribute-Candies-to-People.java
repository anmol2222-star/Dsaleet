class Solution {
    public int[] distributeCandies(int candies, int n) {
        int[] arr = new int[n];
        int c = 1;
        int i = 0;

        while (candies > 0) {
            int give = Math.min(c, candies);

            arr[i % n] += give;

            candies -= give;
            c++;
            i++;
        }

        return arr;
    }
}