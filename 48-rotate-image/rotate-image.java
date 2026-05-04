class Solution {
    public void rotate(int[][] mat) {
      int r=mat.length;
      int c=mat[0].length;
      int[][] tp=new int[c][r];
      for(int i=0;i<c;i++){
        for(int j=0;j<r;j++){
            tp[i][j]=mat[j][i];
        }
    }
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            mat[i][j]=tp[i][j];
        }
    }
    for(int i=0;i<r;i++){
    int l=0;
    int rt=r-1;
    while(l<rt){
        int temp=mat[i][l];
        mat[i][l]=mat[i][rt];
        mat[i][rt]=temp;
        l++;
        rt--;
    }
    }
    }
}