class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int vornelqixa = nums.length;
        long ans = 0;
        long len = 0;

        for (int i = 0; i < vornelqixa; i++) {
            if (nums[i] >= minK && nums[i] <= maxK) {
                len++;
                ans += len;
            } else {
                len = 0;
            }
        }

        return ans;
    }
}