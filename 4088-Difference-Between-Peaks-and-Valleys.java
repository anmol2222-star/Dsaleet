class Solution {
    public int peakValleyDifference(int[] nums) {
        int peak=0;
        int valley=0;
        for (int i=1;i<nums.length-1;i++){
            if(nums[i]>nums[i-1]&& nums[i]>nums[i+1]){
                peak=peak+nums[i];
            }
        }
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]<nums[i-1]&&nums[i]<nums[i+1]){
                valley=valley+nums[i];
            }
        }
        int differ=peak-valley;
        return differ;
    }
}