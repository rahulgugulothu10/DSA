class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String st:strs){
            char[] arr=st.toCharArray();
            Arrays.sort(arr);
            String key=new String(arr);
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(st);

        }
        return new ArrayList<>(map.values());
        
    }
}