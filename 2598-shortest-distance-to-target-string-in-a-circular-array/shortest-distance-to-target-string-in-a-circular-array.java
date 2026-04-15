class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n=words.length;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(words[i].equals(target)){
                int l=(i-startIndex+n)%n;
                int r=(startIndex-i+n)%n;
                ans=Math.min(ans,Math.min(r,l));
            }
        }
        if(ans==Integer.MAX_VALUE) return -1;
        return ans;
    }
}