class Solution {
    public int gcd(int a,int b){
        while(b!=0){
            int res=a%b;
            a=b;
            b=res;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        int max=0;
        int[] pfgcd=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            pfgcd[i]=gcd(nums[i],max);
        }
        Arrays.sort(pfgcd);
         
          long sum=0;
         int n=pfgcd.length;
         int i=0;
         int j=n-1;
         while(i<j){
        if(i==j) break;
                sum+=gcd(pfgcd[i],pfgcd[j]);
                i++;
                j--;
            }
            
         return sum;
         }
    }
