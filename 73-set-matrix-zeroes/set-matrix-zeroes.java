class Solution {
    public void setZeroes(int[][] mat) {
        int r=mat.length;
        int c=mat[0].length;
        boolean[] row=new boolean[r];
        boolean[] col=new boolean[c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
            if(mat[i][j]==0){
                row[i]=true;
                col[j]=true;
            }
            }
        }
        for(int i=0;i<r;i++){
            if(row[i]){
                for(int j=0;j<c;j++){
                    mat[i][j]=0;
                }
            }
        }
       
        for(int j=0;j<c;j++){
            if(col[j]){
                for(int i=0;i<r;i++){
                    mat[i][j]=0;
                }
            }
        }
    }
}