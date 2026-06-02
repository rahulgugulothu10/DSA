class Solution {
    public int[] frequencySort(int[] nums) {
        int cnt=0;
       
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
         Integer[] arr=new Integer[nums.length];
         for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
         }
         Arrays.sort(arr,(a,b)->{
            int ma=map.get(a);
            int mb=map.get(b);
            if(ma==mb){
                return b-a;
            }
            return ma-mb;
         });
         int[] res=new int[nums.length];
         for(int i=0;i<nums.length;i++){
            res[i]=arr[i];
         }
         return res;

    }
}