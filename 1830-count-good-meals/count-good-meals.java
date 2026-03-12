class Solution {
    public int countPairs(int[] deliciousness) {
        int n=deliciousness.length;
        int mod=1000000007;
        int cnt=0;
       Map<Integer,Integer> map=new HashMap<>();
       for(int ele:deliciousness){
          int pow=1;
          while(pow<=(1<<21)){
            int pat=pow-ele;
            if(map.containsKey(pat)){
                cnt=(cnt+map.get(pat))%mod;
            }
            pow*=2;
          }
          map.put(ele,map.getOrDefault(ele,0)+1);
       }
       return (int)cnt;
    
    }
}