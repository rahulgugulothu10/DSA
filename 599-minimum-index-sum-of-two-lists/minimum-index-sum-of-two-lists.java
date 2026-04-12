class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int min=Integer.MAX_VALUE;
        int sum=0;
        List<String> list=new ArrayList<>();
        for(int i=0;i<list1.length;i++){
            for(int j=0;j<list2.length;j++){
            if(list1[i].equals(list2[j])){
                sum=i+j;
                if(sum<min){
                    list.clear();
                    list.add(list1[i]);
                    min=sum;
                }
                else if(sum==min){
                    list.add(list1[i]);
                }
            }
            }
        }
        return list.toArray(new String[0]);
    }
}