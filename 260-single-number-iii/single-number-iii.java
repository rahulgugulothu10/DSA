class Solution {
    public int[] singleNumber(int[] nums) {
      Map<Integer,Integer> map=new HashMap<>();
      for(int ele:nums){
        map.put(ele,map.getOrDefault(ele,0)+1);
      }
      List<Integer> res=new ArrayList<>();
      for(Map.Entry<Integer,Integer> entry:map.entrySet()){
        if(entry.getValue()==1){
            res.add(entry.getKey());
        }
      }
      int[] ans=new int[res.size()];
      for(int i=0;i<res.size();i++){
        ans[i]=res.get(i);
      }
      return ans;
       
    }
}