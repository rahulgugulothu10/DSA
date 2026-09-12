class Solution {
    public int maxSumTwoNoOverlap(int[] nums, int fl, int sl) {
        return Math.max(maxsum(nums,fl,sl),maxsum(nums,sl,fl));
    }
    private int maxsum(int[] nums,int l,int r){
        int maxl=0;
        int res=0;
        int suml=0;
        int sumr=0;
        for(int i=0;i<nums.length;i++){
            sumr+=nums[i];
            if(i>=r){
                sumr-=nums[i-r];
            }
            if(i>=r){
                suml+=nums[i-r];
                if(i>=l+r){
                    suml-=nums[i-l-r];
                }
                maxl=Math.max(maxl,suml);
                res=Math.max(res,maxl+sumr);
            }
        }
        return res;
    }
}