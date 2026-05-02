class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int cnt=0;
        int cnt1=0;
        int cnt2=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='L'){
                  cnt++;
            }
            else if(moves.charAt(i)=='R'){
                cnt1++;
            }
            else{
                cnt2++;
            }
        }
        return Math.abs(cnt-cnt1)+cnt2;
    }
}