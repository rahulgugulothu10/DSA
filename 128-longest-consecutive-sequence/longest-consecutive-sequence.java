class Solution {
    public int longestConsecutive(int[] nums) {
        int cnt=1;
        int longest=1;
       
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                continue;
            }
            else if(nums[i]==nums[i-1]+1){
                cnt++;
                
            }
            else{
                cnt=1;
               
            }
            longest=Math.max(longest,cnt);
        }
        return longest;
    }
}