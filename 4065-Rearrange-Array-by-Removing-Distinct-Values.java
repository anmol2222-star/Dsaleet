class Solution {
    public int[] rearrangeArray(int[] nums) {

        int[] freq = new int[101];
        int[] ans = new int[nums.length];

        // Count frequency
        for (int num : nums) {
            freq[num]++;
        }

        int index = 0;

        // Repeat rounds
        while (index < nums.length) {
            for (int i = 1; i <= 100; i++) {
                if (freq[i] > 0) {
                    ans[index++] = i;
                    freq[i]--;
                }
            }
        }

        return ans;
    }
}