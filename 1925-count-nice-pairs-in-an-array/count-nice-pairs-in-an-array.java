class Solution {
    public int rev(int num){
        int rv=0;
         while(num>0){
            int dig=num%10;
               rv=rv*10+dig;
               num=num/10;
         }
         return rv;
    }
    public int countNicePairs(int[] nums) {
        long cnt=0;
        int mod=1000000007;
        Map<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            int val=n-rev(n);
            if(map.containsKey(val)){
                cnt=(cnt+map.get(val))%mod;
            }
            map.put(val,map.getOrDefault(val,0)+1);
        }
        return (int) cnt;
        }
    }
