class Solution {
    public boolean checkDivisibility(int n) {
        int res=digsp(n);
        return n%res==0;
    }
    public int digsp(int n){
        int sum=0;
        int prod=1;
        while(n>0){
            int dig=n%10;
            sum+=dig;
            prod*=dig;
          n/=10;
        }
        return sum+prod;
    }
}