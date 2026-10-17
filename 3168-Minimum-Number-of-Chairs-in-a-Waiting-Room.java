class Solution {
    public int minimumChairs(String s) {
        int count=0;
        int max=0;
        char [] arr=s.toCharArray();
        for(int i=0;i<arr.length;i++){

            if(arr[i]=='E'){
                count++;
                max=Math.max(count,max);
            }
            else if(arr[i]=='L'){
                count--;
                max=Math.max(count,max);
            }
        }
        return max;
    }
}