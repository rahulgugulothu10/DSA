class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return countPairs(nums,upper)-countPairs(nums,lower-1);
    }
    public long countPairs(int[] nums,int tar){
            int l=0;
            int r=nums.length-1;
            long cnt=0;
            while(l<r){
                if(nums[l]+nums[r]<=tar){
                cnt+=(r-l);
                l++;
                }
                else{
                    r--;
                }
            }
            return cnt;
    }
    
           
    }
