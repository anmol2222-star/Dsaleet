class Solution {
    public boolean checkOnesSegment(String s) {
        int c=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='0'&& s.charAt(i+1)=='1'){
                c++;
            }
            if(c>=1){
                return false;
            }
        }
        return true;
    }
}