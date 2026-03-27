class Solution {
    public int heightChecker(int[] heights) {
        int n=heights.length;
        int[] exp=heights.clone();
        Arrays.sort(exp);
        int cnt=0;
        for(int i=0;i<n;i++){
            
                if(heights[i]!=exp[i]){
                    cnt++;
                }
            
        }
        return cnt;
    }
}