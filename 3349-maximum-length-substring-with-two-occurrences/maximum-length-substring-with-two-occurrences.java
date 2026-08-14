class Solution {
    public int maximumLengthSubstring(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int i=0;
        int mlen=0;
       for(int j=0;j<s.length();j++){
        char ch=s.charAt(j);
        map.put(ch,map.getOrDefault(ch,0)+1);
        while(map.get(ch)>2){
            char lch=s.charAt(i);
            map.put(lch,map.get(lch)-1);
            i++;
        }
          mlen=Math.max(mlen,j-i+1);
       }
       return mlen;
    }
}