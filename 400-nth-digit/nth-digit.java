class Solution {
    public int findNthDigit(int n) {
        long st=1;
        long cnt=9;
        long dl=1;
        long N=n;
        while(N>dl*cnt){
            N-=dl*cnt;
            dl++;
            cnt=cnt*10;
            st=st*10;
        }
        long num=st+(N-1)/dl;
        int ind=(int)((N-1)%dl);
        String s=String.valueOf(num);
        char ch=s.charAt(ind);
        int ans=ch-'0';
        return ans;
    }
}