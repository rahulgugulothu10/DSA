class Solution {
    public List<Integer> findAnagrams(String s, String p) {
         List<Integer> list=new ArrayList<>();
        if(s.length()<p.length()) return list;
         Map<Character,Integer> map1=new HashMap<>();
         Map<Character,Integer> map2=new HashMap<>();
        for(char c:p.toCharArray()){
            map1.put(c,map1.getOrDefault(c,0)+1);
        }
        int k=p.length();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map2.put(ch,map2.getOrDefault(ch,0)+1);
             if(i>=k){
                char lch=s.charAt(i-k);
                 if(map2.get(lch)==1){
                    map2.remove(lch);
                 }
                 else{
                    map2.put(lch,map2.get(lch)-1);
                 }
             }
             if(map2.equals(map1)){
                list.add(i-k+1);
             }
        }
        return list;
    }
}