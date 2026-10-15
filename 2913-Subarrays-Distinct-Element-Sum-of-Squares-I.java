class Solution {
    public int sumCounts(List<Integer> nums) {
        int n=nums.size();
        int sum=0;
        for(int i=0;i<n;i++){
            HashSet<Integer>Set=new HashSet<>();
            for(int j=i;j<n;j++){
                Set.add(nums.get(j));
                int count=Set.size();
                sum=sum+count*count;

            }
        }
        return sum;
    }
}