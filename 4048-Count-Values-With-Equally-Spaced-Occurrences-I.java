class Solution {
    public int countSpecialIntegers(int[] nums) {
       int ans=0;
        for(int x=1;x<=100;x++){
            int c=0,p=0,q=0,r=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]==x){
                    c++;
                    if(c==1)p=i;
                    if(c==2)q=i;
                    if(c==3)r=i;
                }
            }
            if (c == 3 && p + r == 2 * q)
                ans++;
        }
        return ans;
    }
}