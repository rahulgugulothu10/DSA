class Solution {
    public boolean canAliceWin(int n) {
        int t=10;
        int r=0;
        while(n>=t){
            n-=t;
            t--;
            r++;
        }
        return r%2==1;
    }
}