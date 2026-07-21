class Solution {
    public long countAlternatingSubarrays(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return 1;
           long cnt=1;
           long len=1;
           for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                len++;
            }
            else{
                len=1;
            }
            cnt+=len;
           }
           return cnt;
    }
}