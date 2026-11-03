class Solution {
    public int minMoves(int[] nums) {
        int max=nums[0];
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            int diff=max-nums[i];
            count=count+diff;
        }
        return count;
    }
}