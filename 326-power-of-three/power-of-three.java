class Solution {
    public boolean isPowerOfThree(int n) {
        for(int i=0;i<31;i++){
            double res=Math.pow(3,i);
            if(res==n) return true;
        }
        return false;
    }
}