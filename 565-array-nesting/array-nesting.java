class Solution {
    public int arrayNesting(int[] nums) {
        int res=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=-1){
                int st=i;
                int cnt=0;
                do{
                    int next=nums[st];
                    nums[st]=-1;
                    st=next;
                    cnt++;
                }while(st!=-1 && nums[st]!=-1);
                res=Math.max(res,cnt);
            }
        }
        return res;
    }
}