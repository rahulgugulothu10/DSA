class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
      String res="";
      for(String word:words){
        int sum=0;
        for(char ch:word.toCharArray()){
            int ind=ch-'a';
            sum+=weights[ind];
        }
        int rem=sum%26;
        char mapch;
        if(rem==0){
            mapch='z';
        }
        else{
            mapch=(char)('z'-rem);
        }
        res+=mapch;
      }
      return res;
    }
}