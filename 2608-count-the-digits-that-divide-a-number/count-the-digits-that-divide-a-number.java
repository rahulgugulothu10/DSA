class Solution {
    public int countDigits(int num) {
        int cnt=0;
        int t=num;
        while(num>0){
            int dig=num%10;
            if(t%dig==0){
                cnt++;
            }
            num/=10;
        }
        return cnt;
    }
}