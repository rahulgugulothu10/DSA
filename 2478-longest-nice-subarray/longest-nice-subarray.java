class Solution {
    public int longestNiceSubarray(int[] nums) {
        int cnt=1;
        for(int i=0;i<nums.length;i++){
            int m=0;
            for(int j=i;j<nums.length;j++){
                if((m & nums[j])!=0){
                  break;
                }
                m|=nums[j];
                cnt=Math.max(cnt,j-i+1);
            }
        }
        return cnt;
    }
}