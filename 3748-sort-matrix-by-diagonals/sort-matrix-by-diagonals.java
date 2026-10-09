class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;
        for(int row=0; row<n; row++){
            int i = row, j = 0;
            List<Integer> lis = new ArrayList<>();
            while(i<n && j<n){
                lis.add(grid[i][j]);
                i++;
                j++;
            }
            Collections.sort(lis,Collections.reverseOrder());
            i = row;
            j = 0;
            
            for(int k=0; k<lis.size(); k++){
                grid[i][j] = lis.get(k);
                i++;
                j++;
            }
        }

        for(int col=1; col<n; col++){
            int i = 0, j = col;
            List<Integer> lis = new ArrayList<>();
            while(i<n && j<n){
                lis.add(grid[i][j]);
                i++;
                j++;
            }
            Collections.sort(lis);
            i = 0;
            j = col;
            
            for(int k=0; k<lis.size(); k++){
                grid[i][j] = lis.get(k);
                i++;
                j++;
            }
        }
        return grid;
    }
}