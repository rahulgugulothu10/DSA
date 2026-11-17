class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> path=new ArrayList<>();
        recSum(candidates,list,path,target,0);
        return list;
    }
    public void recSum(int[] nums,List<List<Integer>> list,List<Integer> path,int tar,int ind){
        if(tar<0) return;
        else if(tar==0){
            list.add(new ArrayList<>(path));
            return;
        }
        else{
            for(int i=ind;i<nums.length;i++){
                if(i>ind && nums[i]==nums[i-1]) continue;
                path.add(nums[i]);
                recSum(nums,list,path,tar-nums[i],i+1);
                path.remove(path.size()-1);
                       
                            }
        }
    }
}