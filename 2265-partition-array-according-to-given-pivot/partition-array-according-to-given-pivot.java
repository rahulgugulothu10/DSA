class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        List<Integer> list=new ArrayList<>();
        for(int num:nums){
            if(num<pivot){
                list.add(num);
            }
        }
        for(int num1:nums){
            if(num1==pivot){
                list.add(num1);
            }
        }
        for(int num2:nums){
            if(num2>pivot){
                list.add(num2);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}