class Solution {
    public boolean isGood(int[] nums) {
        int max=0;
        for(int num:nums){
              max=Math.max(max,num);
        }
        if((max+1)!=nums.length){
            return false;
        }
        int[] cnt=new int[max+1];
        for(int n:nums){
            cnt[n]++;
        }
         for(int i=1;i<max;i++){
            if(cnt[i]!=1){
                return false;
            }
         }
         return cnt[max]==2;

       
    }
}