class Solution {
    public int findLHS(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int ans=0;
        for(int k:map.keySet()){
            if(map.containsKey(k+1)){
                ans=Math.max(ans,map.get(k)+map.get(k+1));
            }
        }
        return ans;
    }
}