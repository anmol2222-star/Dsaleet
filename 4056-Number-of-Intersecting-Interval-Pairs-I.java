class Solution {
    public int countIntersectingIntervals(int[][] intervals) {
        int count=0;
        for(int i=0;i<intervals.length;i++){
            for(int j=i+1;j<intervals.length;j++){
                int a1=intervals[i][0];
                int a2=intervals[i][1];

                int b1=intervals[j][0];
                int b2=intervals[j][1];

                if(a1<=b2 && b1<=a2){
                    count++;
                }
            }
        }
        return count;
    }
}