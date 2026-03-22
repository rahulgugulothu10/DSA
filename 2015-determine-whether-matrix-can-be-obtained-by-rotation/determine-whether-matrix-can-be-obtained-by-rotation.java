class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i=0;i<4;i++){
            if(isEq(mat,target)){
                return true;
            }
            mat=rotate(mat);
            
        }return false;
        }
        public int[][] rotate(int[][] mat){
            int n=mat.length;
            int[][] newmat=new int[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    newmat[j][n-i-1]=mat[i][j];
                }
            }
            return newmat;
             }
             public boolean isEq(int[][] a,int[][] b){
                int n=a.length;
                for(int i=0;i<n;i++){
                    for(int j=0;j<n;j++){
                        if(a[i][j]!=b[i][j]){
                            return false;
                        }
                    }
                    
                }
return true;
             }
}