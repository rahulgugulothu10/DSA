class Solution {
    public int maxProduct(String[] words) {
    int n=words.length;
    int[] m=new int[n];
    for(int i=0;i<n;i++){
        int mas=0;
        for(char ch:words[i].toCharArray()){
            mas|=1<<(ch-'a');
        }
        m[i]=mas;
    }
    int mp=0;
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if((m[i]&m[j])==0){
                int prod=words[i].length()*words[j].length();
                mp=Math.max(mp,prod);
            }
        }
    }
        return mp;
    }
}