class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet <Integer> Set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            Set.add(nums[i]);
        }
        int multiple=k;
        while(Set.contains(multiple)){
            multiple=multiple+k;
        }
        return multiple;

    }
}