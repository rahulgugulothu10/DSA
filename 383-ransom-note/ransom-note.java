class Solution {
    public boolean canConstruct(String rn, String mag) {
        Map<Character,Integer> map=new HashMap<>();
        Map<Character,Integer> map2=new HashMap<>();
        for(char ch:rn.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch:mag.toCharArray()){
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }
        for(char ch:map.keySet()){
            int nd=map.get(ch);
            int avl=map2.getOrDefault(ch,0);
            if(avl<nd) return false;
        }
        return true;
    }
}