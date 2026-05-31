class Solution {
    public boolean isPowerOfTwo(int n) {
        
        for(int i=0;i<31;i++){
            double res=Math.pow(2,i);
            if(res==n){
                return true;
            }
        }
        return false;
    }
}