class Solution {
    public int longestArithSeqLength(int[] nums) {
        int n=nums.length;
        int an=2;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int d=nums[j]-nums[i];
                int prv=nums[j];
                int len=2;
                for(int k=j+1;k<n;k++){
                    if((nums[k]-prv)==d){
                        len++;
                        prv=nums[k];
                    }
                }
                 an=Math.max(an,len);
            }
           
        }
        return an;
    }
}