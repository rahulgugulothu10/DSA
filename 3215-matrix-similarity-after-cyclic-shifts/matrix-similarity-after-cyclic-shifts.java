class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int r=mat.length;
        int c=mat[0].length;
        int shift=k%c;
        if(shift==0){
            return true;
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                int newind=0;
                if(i%2==0){
                    newind=(j+shift)%c;
                }
                else{
                     newind=(j-shift+c)%c;
                }
                if(mat[i][j]!=mat[i][newind]){
                    return false;
                }
            }
        }
        return true;
    }
}