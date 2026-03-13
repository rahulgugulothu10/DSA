class Solution {
    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
        long l=1;
     long h = (long)1e18;
    while(l<h){
        long mid=(l+h)/2;
         long toth=0;
         for(int t:workerTimes){
             long k = (long)((-1 + Math.sqrt(1 + (8.0 * mid) / t)) / 2);
             toth+=k;
             if(toth>=mountainHeight){
                break;
             }}
             if(toth>=mountainHeight){
                h=mid;
             }
             else{
                l=mid+1;
             }
         
    }
    return l;
    }
}