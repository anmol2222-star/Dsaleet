class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer>Set1=new HashSet<>();
        HashSet<Integer>Set2=new HashSet<>();

        for(int num:nums1){
            Set1.add(num);
        }
        for(int num:nums2){
            Set2.add(num);
        }
        List<Integer>list1=new ArrayList<>();
        List<Integer>list2=new ArrayList<>();

        for(int num:Set1){
            if(!Set2.contains(num)){
                list1.add(num);
            }
        }
        for(int num:Set2){
            if(!Set1.contains(num)){
                list2.add(num);
            }
        }
        List<List<Integer>>ans=new ArrayList<>();
        ans.add(list1);
        ans.add(list2);

        return ans;

    }
}